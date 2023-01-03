package testes;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizouConexao(){
        //fez algo
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //insere dados no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove dados no DB
        LOGGER.info("removeu dados");
    }
}
