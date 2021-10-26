package com.usj.minhamorada.models.dto;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.usj.minhamorada.models.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonInclude(value = Include.NON_NULL)
public class DTO {
	
	private String statusCode;
	private Apartamento apartamento; 
	private Morador morador; 
	private String mensagem;
	private String error;	
	private List<Morador> listaMoradores; 
	private List<Apartamento> listaApartamentos;
	private Espaco espaco;
	private List<Espaco> listaEspacos;
	private AgendamentoEspaco agendamentoEspaco;
	private List<AgendamentoEspaco> listaAgendamentosEspacos;
	private Assembleia assembleia;
	private List<Assembleia> listaAssembleias;

}