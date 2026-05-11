package org.example;

public class ExportadorHTML extends ExportadorRelatorio {

    @Override
    protected String formatarDados(String dadosBrutos) {
        String[] partes = dadosBrutos.split(", ");
        StringBuilder html = new StringBuilder();
        html.append("<ul>\n");
        for (String parte : partes) {
            html.append("  <li>").append(parte).append("</li>\n");
        }
        html.append("</ul>");
        return html.toString();
    }
}