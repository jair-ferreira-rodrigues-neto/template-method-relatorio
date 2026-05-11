package org.example;

public class ExportadorCSV extends ExportadorRelatorio {

    @Override
    protected String formatarDados(String dadosBrutos) {
        return dadosBrutos.replace(", ", ";");
    }
}