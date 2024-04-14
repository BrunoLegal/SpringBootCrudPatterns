package com.finan.orcamento;

import java.math.BigDecimal;

import com.finan.orcamento.controller.OrcamentoController;
import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.proxy.OrcamentoProxy;
import com.finan.orcamento.service.OrcamentoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TesteMain {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(TesteMain.class, args);
        OrcamentoController orcamentoController = context.getBean(OrcamentoController.class);

        OrcamentoModel orcamentoModel = orcamentoController.buscaPorId(3L).getBody();
        System.out.println("valor do orcamento ="+ orcamentoModel.getValorOrcamento());
        System.out.println("tempo para ver o desconto="+ orcamentoModel.getDescontoOrcamento());

        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoModel);
        System.out.println("valor sem proxy ="+proxy.getDescontoOrcamento());
        System.out.println("valor sem proxy ="+proxy.getDescontoOrcamento());
        System.out.println("valor sem proxy ="+proxy.getDescontoOrcamento());
        System.out.println("valor sem proxy ="+proxy.getDescontoOrcamento());
        System.out.println("valor sem proxy ="+proxy.getDescontoOrcamento());
        
    }
}
