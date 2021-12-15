
import com.mycompany.atividade.builder.*;
import com.mycompany.atividade.builder.ProdutoBuilder;
import java.time.LocalDate;


public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(1, "Carlos");
        Produto produto = new ProdutoBuilder()
                .setTitulo("TV LCD")
                .setDescricao("TV smart tv")
                .setMarca("Sansung")
                .setModelo("smart tv android")
                .setPreco(10000)
                .setDataCadastro(LocalDate.now())
                .setDataUltimaAtualizacao(LocalDate.now())
                .setCategoria("Eletronico")
                .setVendedor(vendedor)
                .build();
        
        System.out.println(produto);
    }
    
}
