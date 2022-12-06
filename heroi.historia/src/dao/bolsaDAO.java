package dao;

import java.util.HashMap;

public class bolsaDAO implements IBolsa {
    public HashMap<String, String> bolsa = new HashMap<>();

    public bolsaDAO(){};

    @Override
    public  void addItem(String espacoInvent, Object nomeItem) {

        bolsa.put(espacoInvent, nomeItem.toString());
    }
    @Override
    public Object buscarItem(String espacoInvent) {

        return "Voce utilizou " + bolsa.get(espacoInvent) + "!";

    }

}
