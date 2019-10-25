package br.com.sysdesc.dto.sincronizacao;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SincronizacaoItemDTO extends SincronizacaoVersaoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long codigoTabela;
}
