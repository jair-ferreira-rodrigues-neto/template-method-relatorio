package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemplateMethodTest {

    @Test
    public void testExportacaoHTML() {
        ExportadorRelatorio exportador = new ExportadorHTML();
        String resultadoEsperado = "Arquivo salvo com o conteudo:\n" +
                "<ul>\n" +
                "  <li>Nome: Joao</li>\n" +
                "  <li>Idade: 30</li>\n" +
                "  <li>Cargo: Desenvolvedor</li>\n" +
                "</ul>";

        assertEquals(resultadoEsperado, exportador.exportar());
    }

    @Test
    public void testExportacaoCSV() {
        ExportadorRelatorio exportador = new ExportadorCSV();
        String resultadoEsperado = "Arquivo salvo com o conteudo:\n" +
                "Nome: Joao;Idade: 30;Cargo: Desenvolvedor";

        assertEquals(resultadoEsperado, exportador.exportar());
    }
}