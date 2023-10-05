public class nove {
    public static void main(String[] args) {

        double salario = 1200;
      
        if (salario <= 280) {
            double aumento, novo_salario, percentual;

            aumento = salario * 0.20;
            novo_salario = aumento + salario;
            percentual = novo_salario - salario;

            System.out.println("Salário antes do aumento: " + salario + " R$");
            System.out.println("Novo salário: " + novo_salario + " R$");
            System.out.println("O aumento foi de 20%");
            System.out.println("Percentual de aumento: " + percentual);
          
        }

        if (salario > 280 && salario < 700) {
            double aumento, novo_salario, percentual;

            aumento = salario * 0.15;
            novo_salario = aumento + salario;
            percentual = novo_salario - salario;

            System.out.println("Salário antes do aumento: " + salario + " R$");
            System.out.println("Novo salário: " + novo_salario + " R$");
            System.out.println("O aumento foi de 15%");
            System.out.println("Percentual de aumento: " + percentual);
        
        }

        if (salario >= 700 && salario < 1500) {
            double aumento, novo_salario, percentual;

            aumento = salario * 0.10;
            novo_salario = aumento + salario;
            percentual = novo_salario - salario;

            System.out.println("Salário antes do aumento: " + salario + " R$");
            System.out.println("Novo salário: " + novo_salario + " R$");
            System.out.println("O aumento foi de 10%");
            System.out.println("Percentual de aumento: " + percentual);
        
        }

        if (salario >= 1500) {
            double aumento, novo_salario, percentual;

            aumento = salario * 0.05;
            novo_salario = aumento + salario;
            percentual = novo_salario - salario;

            System.out.println("Salário antes do aumento: " + salario + " R$");
            System.out.println("Novo salário: " + novo_salario + " R$");
            System.out.println("O aumento foi de 5%");
            System.out.println("Percentual de aumento: " + percentual);
        }
    }
}
