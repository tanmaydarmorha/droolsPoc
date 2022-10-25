package com.example.rulesenginepoc.controllers;

import com.example.rulesenginepoc.model.RoutingLogicBaseArgs;
import com.example.rulesenginepoc.model.UnitOfWorkDecider;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleInputController {

    @Autowired
    private KieSession kieSession;

    /*
     *     when
     *         RoutingLogicBaseArgs(operation == 'read');
     *         RoutingLogicBaseArgs(cdoId == '1');
     *         RoutingLogicBaseArgs(resource == 'ExplanationOfBenefit');
     *
     * Whatever condition matches last, it will be the output of the response
     *
     *
     *     when
     *        RoutingLogicBaseArgs(operation == 'read' && cdoId == '1' && resource == 'ExplanationOfBenefit');
     *
     * To match all the conditions at once, you need to pass the conditions together
     * */

    @PostMapping("/unitOfWork")
    public UnitOfWorkDecider getOrchestrator(@RequestBody RoutingLogicBaseArgs args) {
        UnitOfWorkDecider decider = new UnitOfWorkDecider("test-operation-id", "test-config-type", "test-uuid");
        kieSession.insert(args);
        kieSession.setGlobal("unitOfWorkDecider", decider);
        kieSession.fireAllRules();
        return decider;
    }
}
