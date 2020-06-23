package br.com.conecta.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="c_anuncios")
public class Anuncios {

	@Id
	private Long id;
	
	@NotNull
	@Column(name = "usuar_id")
	private Long usuarId;
	
	@NotNull
	private String codigo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Negocio negocio;
	
	@NotNull
	@Column(name = "data_anuncio")
	private LocalDate dataAnuncio;
	
	@Column(name = "data_ini_cotacao")
	private LocalDate dataIniCotacao;
	
	@Column(name = "data_encerrado")
	private LocalDate dataEncerrado;
	
	@Column(name = "autoexpire_data")
	private LocalDate autoExpireData;
	
	@NotNull
	@Column(name = "encerrado_motivo")
	private String encerradoMotivo;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@NotNull
	@Column(name = "varie_id")
	private Long varieId;
	
	private String categoria;
	
	private String germinacao;
	
	@NotNull
	private String embalagem;
	
	@Column(name = "vigor_ea48h")
	private String vigorEa48h;
	
	private String peneira;
	
	@Column(name = "tratam_indust")
	private String tratamIndust;
	
	@Column(name = "tratam_texto")
	private String tratamTexto;
	
	private String pms;
	
	@NotNull
	private Long quantidade;
	
	private String frete;
	
	@Column(name = "valor_por_embalagem")
	private BigDecimal valorPorEmbalagem;
	
	@Column(name = "valor_royalties")
	private BigDecimal valorRoyalties;
	
	@Column(name = "valor_por_kg")
	private BigDecimal valorPorKg;
	
	private String regiao;
	
	private String uf;
	
	private String cidade;
	
	@Column(name = "forma_pgto")
	private String formaPgto;
	
	@Column(name = "troca_varie_id")
	private Long trocaVarieId;
	
	public Anuncios() {}

	public Anuncios(Long id, Long usuarId, String codigo, Negocio negocio, LocalDate dataAnuncio,
			LocalDate dataIniCotacao, LocalDate dataEncerrado, LocalDate autoExpireData, String encerradoMotivo,
			Status status, Long varieId, String categoria, String germinacao, String embalagem, String vigorEa48h,
			String peneira, String tratamIndust, String tratamTexto, String pms, Long quantidade, String frete,
			BigDecimal valorPorEmbalagem, BigDecimal valorRoyalties, BigDecimal valorPorKg, String regiao, String uf,
			String cidade, String formaPgto, Long trocaVarieId) {
		super();
		this.id = id;
		this.usuarId = usuarId;
		this.codigo = codigo;
		this.negocio = negocio;
		this.dataAnuncio = dataAnuncio;
		this.dataIniCotacao = dataIniCotacao;
		this.dataEncerrado = dataEncerrado;
		this.autoExpireData = autoExpireData;
		this.encerradoMotivo = encerradoMotivo;
		this.status = status;
		this.varieId = varieId;
		this.categoria = categoria;
		this.germinacao = germinacao;
		this.embalagem = embalagem;
		this.vigorEa48h = vigorEa48h;
		this.peneira = peneira;
		this.tratamIndust = tratamIndust;
		this.tratamTexto = tratamTexto;
		this.pms = pms;
		this.quantidade = quantidade;
		this.frete = frete;
		this.valorPorEmbalagem = valorPorEmbalagem;
		this.valorRoyalties = valorRoyalties;
		this.valorPorKg = valorPorKg;
		this.regiao = regiao;
		this.uf = uf;
		this.cidade = cidade;
		this.formaPgto = formaPgto;
		this.trocaVarieId = trocaVarieId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autoExpireData == null) ? 0 : autoExpireData.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataAnuncio == null) ? 0 : dataAnuncio.hashCode());
		result = prime * result + ((dataEncerrado == null) ? 0 : dataEncerrado.hashCode());
		result = prime * result + ((dataIniCotacao == null) ? 0 : dataIniCotacao.hashCode());
		result = prime * result + ((embalagem == null) ? 0 : embalagem.hashCode());
		result = prime * result + ((encerradoMotivo == null) ? 0 : encerradoMotivo.hashCode());
		result = prime * result + ((formaPgto == null) ? 0 : formaPgto.hashCode());
		result = prime * result + ((frete == null) ? 0 : frete.hashCode());
		result = prime * result + ((germinacao == null) ? 0 : germinacao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((negocio == null) ? 0 : negocio.hashCode());
		result = prime * result + ((peneira == null) ? 0 : peneira.hashCode());
		result = prime * result + ((pms == null) ? 0 : pms.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result + ((regiao == null) ? 0 : regiao.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tratamIndust == null) ? 0 : tratamIndust.hashCode());
		result = prime * result + ((tratamTexto == null) ? 0 : tratamTexto.hashCode());
		result = prime * result + ((trocaVarieId == null) ? 0 : trocaVarieId.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		result = prime * result + ((usuarId == null) ? 0 : usuarId.hashCode());
		result = prime * result + ((valorPorEmbalagem == null) ? 0 : valorPorEmbalagem.hashCode());
		result = prime * result + ((valorPorKg == null) ? 0 : valorPorKg.hashCode());
		result = prime * result + ((valorRoyalties == null) ? 0 : valorRoyalties.hashCode());
		result = prime * result + ((varieId == null) ? 0 : varieId.hashCode());
		result = prime * result + ((vigorEa48h == null) ? 0 : vigorEa48h.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anuncios other = (Anuncios) obj;
		if (autoExpireData == null) {
			if (other.autoExpireData != null)
				return false;
		} else if (!autoExpireData.equals(other.autoExpireData))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataAnuncio == null) {
			if (other.dataAnuncio != null)
				return false;
		} else if (!dataAnuncio.equals(other.dataAnuncio))
			return false;
		if (dataEncerrado == null) {
			if (other.dataEncerrado != null)
				return false;
		} else if (!dataEncerrado.equals(other.dataEncerrado))
			return false;
		if (dataIniCotacao == null) {
			if (other.dataIniCotacao != null)
				return false;
		} else if (!dataIniCotacao.equals(other.dataIniCotacao))
			return false;
		if (embalagem == null) {
			if (other.embalagem != null)
				return false;
		} else if (!embalagem.equals(other.embalagem))
			return false;
		if (encerradoMotivo == null) {
			if (other.encerradoMotivo != null)
				return false;
		} else if (!encerradoMotivo.equals(other.encerradoMotivo))
			return false;
		if (formaPgto == null) {
			if (other.formaPgto != null)
				return false;
		} else if (!formaPgto.equals(other.formaPgto))
			return false;
		if (frete == null) {
			if (other.frete != null)
				return false;
		} else if (!frete.equals(other.frete))
			return false;
		if (germinacao == null) {
			if (other.germinacao != null)
				return false;
		} else if (!germinacao.equals(other.germinacao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (negocio != other.negocio)
			return false;
		if (peneira == null) {
			if (other.peneira != null)
				return false;
		} else if (!peneira.equals(other.peneira))
			return false;
		if (pms == null) {
			if (other.pms != null)
				return false;
		} else if (!pms.equals(other.pms))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (regiao == null) {
			if (other.regiao != null)
				return false;
		} else if (!regiao.equals(other.regiao))
			return false;
		if (status != other.status)
			return false;
		if (tratamIndust == null) {
			if (other.tratamIndust != null)
				return false;
		} else if (!tratamIndust.equals(other.tratamIndust))
			return false;
		if (tratamTexto == null) {
			if (other.tratamTexto != null)
				return false;
		} else if (!tratamTexto.equals(other.tratamTexto))
			return false;
		if (trocaVarieId == null) {
			if (other.trocaVarieId != null)
				return false;
		} else if (!trocaVarieId.equals(other.trocaVarieId))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		if (usuarId == null) {
			if (other.usuarId != null)
				return false;
		} else if (!usuarId.equals(other.usuarId))
			return false;
		if (valorPorEmbalagem == null) {
			if (other.valorPorEmbalagem != null)
				return false;
		} else if (!valorPorEmbalagem.equals(other.valorPorEmbalagem))
			return false;
		if (valorPorKg == null) {
			if (other.valorPorKg != null)
				return false;
		} else if (!valorPorKg.equals(other.valorPorKg))
			return false;
		if (valorRoyalties == null) {
			if (other.valorRoyalties != null)
				return false;
		} else if (!valorRoyalties.equals(other.valorRoyalties))
			return false;
		if (varieId == null) {
			if (other.varieId != null)
				return false;
		} else if (!varieId.equals(other.varieId))
			return false;
		if (vigorEa48h == null) {
			if (other.vigorEa48h != null)
				return false;
		} else if (!vigorEa48h.equals(other.vigorEa48h))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUsuarId() {
		return usuarId;
	}

	public void setUsuarId(Long usuarId) {
		this.usuarId = usuarId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	public LocalDate getDataAnuncio() {
		return dataAnuncio;
	}

	public void setDataAnuncio(LocalDate dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}

	public LocalDate getDataIniCotacao() {
		return dataIniCotacao;
	}

	public void setDataIniCotacao(LocalDate dataIniCotacao) {
		this.dataIniCotacao = dataIniCotacao;
	}

	public LocalDate getDataEncerrado() {
		return dataEncerrado;
	}

	public void setDataEncerrado(LocalDate dataEncerrado) {
		this.dataEncerrado = dataEncerrado;
	}

	public LocalDate getAutoExpireData() {
		return autoExpireData;
	}

	public void setAutoExpireData(LocalDate autoExpireData) {
		this.autoExpireData = autoExpireData;
	}

	public String getEncerradoMotivo() {
		return encerradoMotivo;
	}

	public void setEncerradoMotivo(String encerradoMotivo) {
		this.encerradoMotivo = encerradoMotivo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getVarieId() {
		return varieId;
	}

	public void setVarieId(Long varieId) {
		this.varieId = varieId;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getGerminacao() {
		return germinacao;
	}

	public void setGerminacao(String germinacao) {
		this.germinacao = germinacao;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public String getVigorEa48h() {
		return vigorEa48h;
	}

	public void setVigorEa48h(String vigorEa48h) {
		this.vigorEa48h = vigorEa48h;
	}

	public String getPeneira() {
		return peneira;
	}

	public void setPeneira(String peneira) {
		this.peneira = peneira;
	}

	public String getTratamIndust() {
		return tratamIndust;
	}

	public void setTratamIndust(String tratamIndust) {
		this.tratamIndust = tratamIndust;
	}

	public String getTratamTexto() {
		return tratamTexto;
	}

	public void setTratamTexto(String tratamTexto) {
		this.tratamTexto = tratamTexto;
	}

	public String getPms() {
		return pms;
	}

	public void setPms(String pms) {
		this.pms = pms;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getFrete() {
		return frete;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}

	public BigDecimal getValorPorEmbalagem() {
		return valorPorEmbalagem;
	}

	public void setValorPorEmbalagem(BigDecimal valorPorEmbalagem) {
		this.valorPorEmbalagem = valorPorEmbalagem;
	}

	public BigDecimal getValorRoyalties() {
		return valorRoyalties;
	}

	public void setValorRoyalties(BigDecimal valorRoyalties) {
		this.valorRoyalties = valorRoyalties;
	}

	public BigDecimal getValorPorKg() {
		return valorPorKg;
	}

	public void setValorPorKg(BigDecimal valorPorKg) {
		this.valorPorKg = valorPorKg;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getFormaPgto() {
		return formaPgto;
	}

	public void setFormaPgto(String formaPgto) {
		this.formaPgto = formaPgto;
	}

	public Long getTrocaVarieId() {
		return trocaVarieId;
	}

	public void setTrocaVarieId(Long trocaVarieId) {
		this.trocaVarieId = trocaVarieId;
	}
	
	
	
	
}
