package dao;

import java.util.HashMap;
import java.util.Objects;

public class bolsaDAO implements IBolsa {
    public HashMap<String, String> bolsa = new HashMap<>();

    public bolsaDAO(){};

    @Override
    public  void addItem(String espacoInvent, Object nomeItem) {

        bolsa.put(espacoInvent, nomeItem.toString());
    }
    @Override
    public void buscarItem(String espacoInvent) {

        System.out.println("Voce utilizou " + bolsa.get(espacoInvent) + "!");
    }

}
