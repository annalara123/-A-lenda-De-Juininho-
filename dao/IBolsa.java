package dao;

public interface IBolsa {
    public void addItem(String nomeItem, Object espacoInvent);

    public void buscarItem(String espacoInvent);
}
