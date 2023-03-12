public class AnimalFactory {

    public static IAnimal obterAnimal(String animal) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Animal" + animal);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Animal inexistente");
        }
        if (!(objeto instanceof IAnimal)) {
            throw new IllegalArgumentException("Animal inválido");
        }
        return (IAnimal) objeto;
    }


}
