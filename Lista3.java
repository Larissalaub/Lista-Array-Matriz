import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
        //Ex1();
        //Ex2();
        //Ex3();
        //Ex4();
        //Ex5();
        //Ex6();
        //Ex7();
        //Ex8();
        //Ex9();
        //Ex10();
        //Ex11();
        //Ex12();
        //Ex13();
        //Ex13();
        //Ex15();

    }

    public static void Ex1() {
        for( int num = 50; num < 9500; num++) {
            if (num % 3 == 0){
                System.out.println(num);
            }
        }
    }

    public static void Ex2() {
        for( int i = 2; i < 125; i++) {
            if (i % 10 == 0){
                System.out.println("Mutiplo de 10 ="+ i);
            }else{
                System.out.println(i);
            }
        }
    }
    public static void Ex3(int ate) {
        int soma = 0;
        for(int i = 0; i <= ate; i++){
            soma = soma + i;
        }
        System.out.println("A Soma do temo da sequencia é " + soma);
    } 
public static void Ex4() {
    int soma;
    Scanner scan = new Scanner(System.in);
    System.out.println("até qual termo deverá ser exibida a soma");
     soma = scan.nextInt();

    Ex3(soma);
}
public static void Ex5(){
    int soma = 0;
    int termo = 5;
     for(int i = 0; i < 15; i++){
        soma += termo;
        
         termo +=5;
}
System.out.println(soma);
     }

     public static void Ex6(){
         Scanner scan = new Scanner(System.in);

         int primeiro, ultimo;

         System.out.println("Inrira o primeiro e o último termo da sequência desejada");
         primeiro = scan.nextInt();
         ultimo = scan.nextInt();
         
          int soma = 0 ;
          int termo = primeiro;

           while (termo <= ultimo) {
            
             soma += termo;


             termo += 5;
           }
           System.out.println(termo);
     }
     public static void Ex7() {
        double salarioInicial = 1000.00;
        Double aumentoPercentual = 0.015;
    
        for (int ano = 2011; ano <= 2024; ano++) {
            if (ano != 2011) {
                aumentoPercentual *= 2;
            }
            double aumento = salarioInicial * aumentoPercentual;
            salarioInicial += aumento;
    
            System.out.println("Salário em " + ano + ": R$" + salarioInicial);
        }
    }
    public static void Ex8() {
        double salarioCarlos = 1000.00;
        double salarioJoao = salarioCarlos / 3.0;
        double rendimentoCarlos = 0.02;
        double rendimentoJoao = 0.05;
        int meses;
    
        for (meses = 0; salarioJoao < salarioCarlos; meses++) {
            salarioCarlos += salarioCarlos * rendimentoCarlos;
            salarioJoao += salarioJoao * rendimentoJoao;
        }
    
        System.out.println("Quantidade de meses necessários: " + meses);
    }
    public static void Ex9() {
        Scanner scan = new Scanner(System.in);

        int somaPositivos = 0;
        int qntNegativos = 0;
        int numero;

        System.out.println("Insira os números (digite 0 para encerrar):");

        while (true) {
            numero = scan.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero < 0) {
                qntNegativos++;
            } else {
                somaPositivos += numero;
            }
        }

        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println("Quantidade de números negativos: " + qntNegativos);

        scan.close();
    }
    public static void Ex10() {
        Scanner scan = new Scanner(System.in);

        double nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.println("Insira a nota do aluno");
            nota = scan.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida");
            }
        }
        if (nota >= 6) {
            System.out.println("Aluno aprovado");
        }else if (nota >= 5){
            System.out.println("aluni em recupecuperacao");
        }else{
            System.out.println("aluno reprovado");
        }
    }
    public static void Ex11() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("----- Menu de opções -----");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.println("Digite a opção desejada:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularImposto(scanner);
                    break;

                case 2:
                    calcularNovoSalario(scanner);
                    break;

                case 3:
                    classificarSalario(scanner);
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static void calcularImposto(Scanner scanner) {
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();
        double imposto;

        if (salario <= 1500) {
            imposto = salario * 0.05;
        } else if (salario <= 3000) {
            imposto = salario * 0.1;
        } else {
            imposto = salario * 0.15;
        }

        System.out.println("Valor do imposto: R$ " + imposto);
    }

    public static void calcularNovoSalario(Scanner scanner) {
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();
        double novoSalario;

        if (salario > 4500) {
            novoSalario = salario + 250;
        } else if (salario > 3000) {
            novoSalario = salario + 200;
        } else if (salario > 2000) {
            novoSalario = salario + 150;
        } else {
            novoSalario = salario + 130;
        }

        System.out.println("Novo salário: R$ " + novoSalario);
    }

    public static void classificarSalario(Scanner scanner) {
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        if (salario > 3000) {
            System.out.println("Bem remunerado");
        } else {
            System.out.println("Mal remunerado");
        }
    }
     public static void Ex12() {
        Scanner scan = new Scanner(System.in);

        System.out.println("insira o numero de termos desejado");
        int numTermos = scan.nextInt();

        int termo = 2;

        for(int i = 0; i < numTermos; i++){
            System.out.println(termo);
            if (i % 2 == 0) {
                termo = termo *3 - 1;
            }else {
                termo = termo * 2;
            }
        }
     }
     public static void Ex13() {
        Scanner scanner = new Scanner(System.in);

        int numTimes = 5;
        int numjogadores = 15;

        int totalJogadoresMenor18 = 0;
        double somaIdades = 0;
        double somaAlturas = 0;
        int totalJogadoresMais80Kg = 0;

        for (int time = 1; time <= numTimes; time++) {
            double somaIdadesTime = 0;

            for (int jogador = 1; jogador <=  numjogadores; jogador++) {
                int idade = scanner.nextInt();
                somaIdades += idade;
                somaIdadesTime += idade;

                double peso = scanner.nextDouble();
                if (peso > 80) {
                    totalJogadoresMais80Kg++;
                }

                double altura = scanner.nextDouble();
                somaAlturas += altura;

                if (idade < 18) {
                    totalJogadoresMenor18++;
                }
            }

            double mediaIdadesTime = somaIdadesTime / numjogadores;
            System.out.println("Média de idades do time " + time + ": " + mediaIdadesTime);
        }

        double mediaAlturas = somaAlturas / (numTimes * numjogadores);
        System.out.println("Média de alturas de todos os jogadores: " + mediaAlturas);

        double percentualMais80Kg = (double) totalJogadoresMais80Kg / (numTimes * numjogadores) * 100;
        System.out.println("Percentual de jogadores com mais de 80 Kg: " + percentualMais80Kg + "%");

        System.out.println("Quantidade de jogadores com menos de 18 anos: " + totalJogadoresMenor18);

     }
     public static void Ex14() {
        Scanner scanner = new Scanner(System.in);

        int maiorValor = 0;
        int menorValor = 0;
        boolean primeiroValor = true;

        System.out.println("Digite valores inteiros positivos (digite um valor negativo para encerrar):");

        while (true) {
            int valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            if (primeiroValor) {
                maiorValor = valor;
                menorValor = valor;
                primeiroValor = false;
            } else {
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                if (valor < menorValor) {
                    menorValor = valor;
                }
            }
        }

        if (!primeiroValor) {
            System.out.println("Maior valor informado: " + maiorValor);
            System.out.println("Menor valor informado: " + menorValor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }
       }
       public static void Ex15(){
        Scanner scanner = new Scanner(System.in);

        int qtdValores = 15;
        int menorNumero = 0;
        int maiorNumero = 0;
        int somaValores = 0;
        int qtdPares = 0;
        int qtdDivisiveisPor5 = 0;
        boolean primeiroNumero = true;

        System.out.println("Digite 15 valores:");

        for (int i = 0; i < qtdValores; i++) {
            int numero = scanner.nextInt();

            if (primeiroNumero) {
                menorNumero = numero;
                maiorNumero = numero;
                primeiroNumero = false;
            } else {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }

            somaValores += numero;

            if (numero % 2 == 0) {
                qtdPares++;
            }

            if (numero % 5 == 0) {
                qtdDivisiveisPor5++;
            }
        }

        double mediaValores = (double) somaValores / qtdValores;

        System.out.println("Menor número digitado: " + menorNumero);
        System.out.println("Maior número digitado: " + maiorNumero);
        System.out.println("Média dos números digitados: " + mediaValores);
        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números divisíveis por 5: " + qtdDivisiveisPor5);

       }
     }
