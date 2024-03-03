package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @JsonAlias e @JsonProperty são anotações em Jackson, uma biblioteca Java para processar JSON,
// que ajudam a mapear propriedades de classe para campos JSON.

@JsonIgnoreProperties(ignoreUnknown = true) // ignorar propriedades q n é para encontrar
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao

                         //jsonproperty: serializaçao e desserializaçao
                         //@JsonProperty("imdbVotes") String votos
                         ) {
}
