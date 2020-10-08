package exercicio03;

import java.util.Calendar;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        /*
        * Caso o valor para o atributo (dia, mes ou ano) passado por parâmetro ao construtor seja inválido, o
        * determinado atributo, no lugar desse valor inválido, irá receber o dia, mês e/ou ano atual do sistema.
        * */
        if(ano < 1) {
            this.ano = Calendar.getInstance().get(Calendar.YEAR);
        }
        else {
            this.ano = ano;
        }

        if(mes < 1 || mes > 12) {
            this.mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
        }
        else {
            this.mes = mes;
        }

        if((dia < 1 || dia > 31) || !validarDia(dia)) {
            this.dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        }
        else {
            this.dia = dia;
        }
    }

    public void avancarDia() {
        /*
        * Essa função confere se o avanço do dia irá ultrapassar o último dia do mês atual.
        * Caso ultrapasse, o atributo dia irá receber o valor 1 (como primeiro dia do mês) e o atributo mês será
        * incrementado em mais 1 no seu valor.
        */
        this.dia++;

        switch(this.mes) {
            case 2:
                if(verificarAnoBissexto(this.ano) && this.dia > 29 || !verificarAnoBissexto(ano) && this.dia > 28) {
                    this.dia = 1;
                    avancarMes();
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if(this.dia > 30) {
                    this.dia = 1;
                    avancarMes();
                }
                break;

            default:
                if(this.dia > 31) {
                    this.dia = 1;
                    avancarMes();
                }
                break;
        }
    }

    private boolean validarDia(int dia) {
        if(this.mes == 2) {  // Fevereiro só vai até o dia 28 ou até o dia 29 em anos bissextos.
            if(verificarAnoBissexto(this.ano)) {
                return dia <= 29;
            }
            return dia <= 28;
        }
        if(this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            // Abril, junho, setembro e novembro só vai até o dia 30.
            return dia <= 30;
        }
        // Como o sistema não permite passar um dia maior que 31, nos demais meses será sempre verdadeiro.
        return true;
    }

    private boolean verificarAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    private void avancarMes() {
        // Função simples para verificar se o mês é dezembro. Caso seja, o ano avança e o mês se torna janeiro (1).
        if(this.mes == 12) {
            this.mes = 1;
            this.ano++;
        }
        else {
            this.mes++;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                dia +
                "/" + mes +
                "/" + ano +
                '}';
    }


}
