package com.finan.orcamento.model;

import com.finan.orcamento.model.enums.IcmsEstados;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orcamento")
public class OrcamentoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private IcmsEstados icmsEstados;

    @NotNull
    @Column(name="valor_orcamento")
    private BigDecimal valorOrcamento;

    @Column(name="valor_icms")
    private BigDecimal valorICMS;

    @ManyToOne
    @JoinColumn(name="usuario_id", referencedColumnName = "id")
    private UsuarioModel usuario;

    @Column(name="qtd_itens")
    private int qtdItens;

    @Column(name="desconto_orcamento")
    private BigDecimal descontoOrcamento;

    public Long getId() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IcmsEstados getIcmsEstados() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return icmsEstados;
    }

    public void setIcmsEstados(IcmsEstados icmsEstados) {
        this.icmsEstados = icmsEstados;
    }

    @NotNull
    public BigDecimal getValorOrcamento() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return valorOrcamento;
    }

    public void setValorOrcamento(@NotNull BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getValorICMS() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        return valorICMS;
    }

    public void setValorICMS(BigDecimal valorICMS) {
        this.valorICMS = valorICMS;
    }

    public UsuarioModel getUsuario() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public int getQtdItens() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getDescontoOrcamento() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }

    public void calcularIcms() {
        this.valorICMS = this.icmsEstados.getStrategy().calcular(this.valorOrcamento);
    }

    public OrcamentoModel(Long id, IcmsEstados icmsEstados, @NotNull BigDecimal valorOrcamento, BigDecimal valorICMS, UsuarioModel usuario, int qtdItens, BigDecimal descontoOrcamento) {
        this.id = id;
        this.icmsEstados = icmsEstados;
        this.valorOrcamento = valorOrcamento;
        this.valorICMS = valorICMS;
        this.usuario = usuario;
        this.qtdItens = qtdItens;
        this.descontoOrcamento = descontoOrcamento;
    }
}
