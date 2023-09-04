package Fabrica;

import Equipamento.Musica.ReproduzirMusica;
import Equipamento.Navegador.NavegadorInternet;
import Equipamento.Telefone.Telefone;
import EquipamentoIphone.EquipamentoIphone;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoIphone iphone = new EquipamentoIphone();
        ReproduzirMusica musica = (ReproduzirMusica) iphone;
        Telefone telefonico = (Telefone) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;


        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println(" ‴(⁰O⁰)‴ ");
        System.out.println(" ");

        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();
        System.out.println(" (✿◠‿◠) ");
        System.out.println(" ");

        System.out.println("Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
        System.out.println(" (. ❛ ᴗ ❛.)  ");

    }
}