package com.finan.orcamento;

import java.math.BigDecimal;
import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.proxy.OrcamentoProxy;
import com.finan.orcamento.service.OrcamentoService;

public class TesteMain {
    public static void main(String[] args) {
        OrcamentoService orcamentoService = new OrcamentoService();
        OrcamentoModel orcamentoModel = orcamentoService.buscaId(1L);
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
