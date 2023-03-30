import java.util.Scanner;

public class UrnaEletronica{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant_brancos = 0;
        int quant_nulos = 0;
        int quant_SH = 0;
        int quant_MM = 0;
        int quant_HF = 0;
        int voto = 0;
        int quant_voto = 0;
        int maior = 0;
        
            
        do{
        System.out.println("------ URNA ------");
        System.out.println("100 - Super Homem ");
        System.out.println("105 - Mulher Maravilha");
        System.out.println("110 - Homem de Ferro");
        System.out.println("00 - Branco");
        System.out.println("Qualque número diferente dos citados acima qiue for digitado, será contado como voto nulo");

        System.out.println("Digite seu voto consciente em um desses candidatos acima:");
        voto = sc.nextInt();
        quant_voto = quant_voto + 1;

        if(voto == 100){
            System.out.println("Seu voto no Super Homem foi registrado com sucesso!");
            quant_SH = quant_SH + 1 ;

        }else if(voto == 105){
            System.out.println("Seu voto na Mulher Maravilha foi registrado com sucesso!");
            quant_MM = quant_MM + 1 ;

        }else if(voto == 110){
            System.out.println("Seu voto no Homem de Ferro foi registrado com sucesso!");
            quant_HF = quant_HF + 1;

        }else if(voto == 00){
            System.out.println("Seu voto foi registrado como em branco");
            quant_brancos = quant_brancos + 1;

        }else if(voto != 100 && voto != 105 && voto != 110 && voto != 00){
            System.out.println("Seu voto foi registrado como nulo!");
            quant_nulos = quant_nulos + 1;
        }

        }while(voto != -1);

        System.out.println("Votação encerrada!!");
        System.out.println("Quantodade de votos do Super Homem:"+quant_HF);
        System.out.println("Quantidade de votos da Mulher Maravilha:"+quant_MM);
        System.out.println("Quantidade de votos do Super Homem:"+quant_SH);
        System.out.println("Quantidade de votos em branco:"+quant_brancos);
        System.out.println("Quantidade de votos nulos:"+quant_nulos);

        if((quant_SH > quant_MM) && (quant_SH > quant_HF) && (quant_SH > quant_brancos) && (quant_SH > quant_nulos)){
            if(quant_SH > maior)
            System.out.println("O candidato vencedor foi Super Homem!!");

        } else if(quant_MM > quant_SH && quant_MM > quant_HF && quant_MM > quant_brancos && quant_MM > quant_nulos){
            if(quant_MM > maior)
            System.out.println("A cadidata eleita foi a Mulher Maravilha!!");

        } else if(quant_HF > quant_MM && quant_HF > quant_SH && quant_HF > quant_brancos && quant_HF > quant_nulos){
            if(quant_HF > maior )
            System.out.println("O candidato vencedor foi o Homem de Ferro!!!");

        } else if(quant_brancos > quant_HF && quant_brancos > quant_MM && quant_brancos > quant_SH && quant_brancos > quant_nulos){
            if(quant_brancos > maior)
            System.out.println("O número de votos em branco ultrapassaram o número de votos dos outros candidatos");

        } else if (quant_nulos > quant_HF && quant_nulos > quant_MM && quant_nulos > quant_SH && quant_nulos > quant_brancos){
            if(quant_nulos > maior) 
            System.out.println("O número de votos nulos ultrapassou o número de votos dos outros candidatos");
        }

    }
 }





