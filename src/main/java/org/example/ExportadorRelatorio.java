package org.example;

public abstract class ExportadorRelatorio {

    public final String exportar() {
        String dados = lerDadosDoBanco();
        String dadosFormatados = formatarDados(dados);
        return salvarArquivo(dadosFormatados);
    }

    private String lerDadosDoBanco() {
        return "Nome: Joao, Idade: 30, Cargo: Desenvolvedor";
    }

    protected abstract String formatarDados(String dadosBrutos);

    private String salvarArquivo(String dadosFormatados) {
        return "Arquivo salvo com o conteudo:\n" + dadosFormatados;
    }
}