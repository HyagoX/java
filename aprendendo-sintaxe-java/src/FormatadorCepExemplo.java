public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237650");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep nao corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length()!= 8)
            throw new CepInvalidException();

            //Simulando um cep formatado
            return "23.765-064";
   } 
}
