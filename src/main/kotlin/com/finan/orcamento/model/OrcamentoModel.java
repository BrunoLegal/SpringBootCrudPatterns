package com.finan.orcamento.model;

import com.finan.orcamento.model.enums.IcmsEstados;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;



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
    private BigInteger qtdItens;

    @Column(name="desconto_orcamento")
    private BigDecimal descontoOrcamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IcmsEstados getIcmsEstados() {
        return icmsEstados;
    }

    public void setIcmsEstados(IcmsEstados icmsEstados) {
        this.icmsEstados = icmsEstados;
    }

    @NotNull
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(@NotNull BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getValorICMS() {
        return valorICMS;
    }

    public void setValorICMS(BigDecimal valorICMS) {
        this.valorICMS = valorICMS;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public BigInteger getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(BigInteger qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getDescontoOrcamento() {
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }

    public void calcularIcms() {
        this.valorICMS = this.icmsEstados.getStrategy().calcular(this.valorOrcamento);
    }

}
