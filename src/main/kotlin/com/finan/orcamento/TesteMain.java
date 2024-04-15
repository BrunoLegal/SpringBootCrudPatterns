package com.finan.orcamento;

import java.math.BigDecimal;
import java.util.Scanner;

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
        OrcamentoService orcamentoService = context.getBean(OrcamentoService.class);

        Scanner scan = new Scanner(System.in);
        Long id = 3L;



        //DESCOMENTE PARA INTERAGIR
        //System.out.println("Digite o id do orcamento a ser testado: ");
        //id = scan.nextLong();

        OrcamentoModel orcamentoModel = orcamentoService.buscaId(id);
        //Por garantia
        //OrcamentoModel orcamentoModel = new OrcamentoModel(new BigDecimal(1000), new BigDecimal(50), 12);

        System.out.println("TESTE DE DESIGN PATTERN PROXY");
        System.out.println("-------------SEM PROXY--------------");
        System.out.println("Valor do Orcamento = "+ orcamentoModel.getValorOrcamento());
        System.out.println("Desconto Orcamento = "+ orcamentoModel.getDescontoOrcamento());
        System.out.println("Quantidade de Itens = " + orcamentoModel.getQtdItens());
        System.out.println("------------------------------------");
        System.out.println();
        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoModel);

        System.out.println("-------------PROXY PRIMEIRA CHAMADA--------------");
        System.out.println("Valor do Orcamento = "+ proxy.getValorOrcamento());
        System.out.println("Desconto Orcamento = "+ proxy.getDescontoOrcamento());
        System.out.println("Quantidade de Itens = " + proxy.getQtdItens());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------PROXY REPET. 1--------------");
        System.out.println("Valor do Orcamento = "+ proxy.getValorOrcamento());
        System.out.println("Desconto Orcamento = "+ proxy.getDescontoOrcamento());
        System.out.println("Quantidade de Itens = " + proxy.getQtdItens());
        System.out.println("-----------------------------------------");
        System.out.println("-------------PROXY REPET. 2--------------");
        System.out.println("Valor do Orcamento = "+ proxy.getValorOrcamento());
        System.out.println("Desconto Orcamento = "+ proxy.getDescontoOrcamento());
        System.out.println("Quantidade de Itens = " + proxy.getQtdItens());
        System.out.println("-----------------------------------------");
        System.out.println("-------------PROXY REPET. 3--------------");
        System.out.println("Valor do Orcamento = "+ proxy.getValorOrcamento());
        System.out.println("Desconto Orcamento = "+ proxy.getDescontoOrcamento());
        System.out.println("Quantidade de Itens = " + proxy.getQtdItens());
        System.out.println("-----------------------------------------");
        System.out.println("-------------PROXY REPET. 4--------------");
        System.out.println("Valor do Orcamento = "+ proxy.getValorOrcamento());
        System.out.println("Desconto Orcamento = "+ proxy.getDescontoOrcamento());
        System.out.println("Quantidade de Itens = " + proxy.getQtdItens());
        System.out.println("-----------------------------------------");

        
    }
}
