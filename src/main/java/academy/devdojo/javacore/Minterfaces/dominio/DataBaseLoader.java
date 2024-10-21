package academy.devdojo.javacore.Minterfaces.dominio;

import com.mysql.cj.xdevapi.JsonString;

public class DataBaseLoader implements DataLoader{

    @Override
    public void load(){
        System.out.printf("Carregando dados do banco de dados ");
    }

}
