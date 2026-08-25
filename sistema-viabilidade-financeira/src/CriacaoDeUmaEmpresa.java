import java.util.Locale;
import java.util.Scanner;

public class CriacaoDeUmaEmpresa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println(
                "\n==== Sistema de Viabilidade Financeira de uma Pequena Empresa ====\n"
        );

        // Investimento inicial
        System.out.println("==== Investimento inicial ====");

        System.out.print("Valor investido em equipamentos: R$ ");
        double equipamentos = input.nextDouble();

        System.out.print("Valor investido em reformas: R$ ");
        double reformas = input.nextDouble();

        System.out.print("Valor do estoque inicial: R$ ");
        double estoqueInicial = input.nextDouble();

        System.out.print("Valor pago em licenças: R$ ");
        double licencas = input.nextDouble();

        System.out.print("Valor pago em documentação: R$ ");
        double documentacao = input.nextDouble();

        System.out.print("Valor investido em marketing: R$ ");
        double marketing = input.nextDouble();

        // Custos fixos mensais
        System.out.println("\n==== Custos fixos mensais ====");

        System.out.print("Valor mensal do aluguel: R$ ");
        double aluguel = input.nextDouble();

        System.out.print("Valor mensal dos salários: R$ ");
        double salarios = input.nextDouble();

        System.out.print("Valor mensal dos encargos: R$ ");
        double encargos = input.nextDouble();

        System.out.print("Valor mensal da energia elétrica: R$ ");
        double energiaEletrica = input.nextDouble();

        System.out.print("Valor mensal da água: R$ ");
        double agua = input.nextDouble();

        System.out.print("Valor mensal da internet: R$ ");
        double internet = input.nextDouble();

        System.out.print("Valor mensal do sistema ERP: R$ ");
        double sistemaERP = input.nextDouble();

        System.out.print("Valor mensal de outras despesas: R$ ");
        double outrasDespesas = input.nextDouble();

        // Dados de operação e vendas
        System.out.println("\n==== Dados de operação e vendas ====");

        System.out.print("Quantidade de vendas no mês: ");
        long quantidadeDeVendas = input.nextLong();

        System.out.print("Custo variável médio por unidade: R$ ");
        double custoVariavelPorUnidade = input.nextDouble();

        System.out.print("Preço médio de venda por unidade: R$ ");
        double precoMedioDeVenda = input.nextDouble();

        System.out.print("Percentual de impostos sobre o faturamento: ");
        double percentualDeImpostos = input.nextDouble();

        // Cálculos do mês de referência
        double investimentoInicial = calcularInvestimentoInicial(
                equipamentos,
                reformas,
                estoqueInicial,
                licencas,
                documentacao,
                marketing
        );

        double custoFixoMensal = calcularCustoFixoMensal(
                aluguel,
                salarios,
                encargos,
                energiaEletrica,
                agua,
                internet,
                sistemaERP,
                outrasDespesas
        );

        double receitaMensal = calcularFaturamento(
                quantidadeDeVendas,
                precoMedioDeVenda
        );

        double custoVariavelMensal = calcularCustoVariavel(
                quantidadeDeVendas,
                custoVariavelPorUnidade
        );

        double impostoMensal = calcularImposto(
                receitaMensal,
                percentualDeImpostos
        );

        double lucroBrutoMensal = receitaMensal
                - custoVariavelMensal;

        double lucroLiquidoMensal = lucroBrutoMensal
                - custoFixoMensal
                - impostoMensal;

        // Projeção anual com base em um mês constante
        double receitaAnual = receitaMensal * 12.0;
        double custoVariavelAnual = custoVariavelMensal * 12.0;
        double custoFixoAnual = custoFixoMensal * 12.0;
        double totalDeImpostos = impostoMensal * 12.0;
        double lucroBrutoAnual = lucroBrutoMensal * 12.0;
        double lucroLiquidoAnual = lucroLiquidoMensal * 12.0;
        double resultadoAcumuladoAnual = lucroLiquidoAnual;

        double margemMediaDeLucro = lucroLiquidoAnual
                / receitaAnual
                * 100.0;

        double retornoDoInvestimento = investimentoInicial
                / lucroLiquidoMensal;

        // Resultados mensais
        System.out.println("\n================ RESULTADOS MENSAIS ================");

        System.out.printf(
                Locale.US,
                "Quantidade estimada de vendas: %d unidades%n",
                quantidadeDeVendas
        );

        System.out.printf(
                Locale.US,
                "Receita mensal: R$ %.2f%n",
                receitaMensal
        );

        System.out.printf(
                Locale.US,
                "Custo variável mensal: R$ %.2f%n",
                custoVariavelMensal
        );

        System.out.printf(
                Locale.US,
                "Custo fixo mensal: R$ %.2f%n",
                custoFixoMensal
        );

        System.out.printf(
                Locale.US,
                "Impostos mensais: R$ %.2f%n",
                impostoMensal
        );

        System.out.printf(
                Locale.US,
                "Lucro bruto mensal: R$ %.2f%n",
                lucroBrutoMensal
        );

        System.out.printf(
                Locale.US,
                "Lucro líquido mensal: R$ %.2f%n",
                lucroLiquidoMensal
        );

        // Resultados anuais
        System.out.println("\n================ RESULTADOS ANUAIS ================");

        System.out.printf(
                Locale.US,
                "Receita total anual: R$ %.2f%n",
                receitaAnual
        );

        System.out.printf(
                Locale.US,
                "Custos variáveis anuais: R$ %.2f%n",
                custoVariavelAnual
        );

        System.out.printf(
                Locale.US,
                "Custos fixos anuais: R$ %.2f%n",
                custoFixoAnual
        );

        System.out.printf(
                Locale.US,
                "Total anual de impostos: R$ %.2f%n",
                totalDeImpostos
        );

        System.out.printf(
                Locale.US,
                "Lucro bruto anual: R$ %.2f%n",
                lucroBrutoAnual
        );

        System.out.printf(
                Locale.US,
                "Lucro líquido anual: R$ %.2f%n",
                lucroLiquidoAnual
        );

        System.out.printf(
                Locale.US,
                "Resultado acumulado após doze meses: R$ %.2f%n",
                resultadoAcumuladoAnual
        );

        System.out.printf(
                Locale.US,
                "Investimento inicial: R$ %.2f%n",
                investimentoInicial
        );

        System.out.printf(
                Locale.US,
                "Margem média de lucro: %.2f%%%n",
                margemMediaDeLucro
        );

        System.out.printf(
                Locale.US,
                "Prazo aproximado de retorno: %.2f meses%n",
                retornoDoInvestimento
        );

        System.out.println("=====================================================\n");

        input.close();
    }

    public static double calcularInvestimentoInicial(
            double equipamentos,
            double reformas,
            double estoqueInicial,
            double licencas,
            double documentacao,
            double marketing
    ) {
        return equipamentos
                + reformas
                + estoqueInicial
                + licencas
                + documentacao
                + marketing;
    }

    public static double calcularCustoFixoMensal(
            double aluguel,
            double salarios,
            double encargos,
            double energiaEletrica,
            double agua,
            double internet,
            double sistemaERP,
            double outrasDespesas
    ) {
        return aluguel
                + salarios
                + encargos
                + energiaEletrica
                + agua
                + internet
                + sistemaERP
                + outrasDespesas;
    }

    public static double calcularCustoVariavel(
            long quantidadeDeVendas,
            double custoVariavelPorUnidade
    ) {
        return quantidadeDeVendas * custoVariavelPorUnidade;
    }

    public static double calcularFaturamento(
            long quantidadeDeVendas,
            double precoMedioDeVenda
    ) {
        return quantidadeDeVendas * precoMedioDeVenda;
    }

    public static double calcularImposto(
            double faturamentoMensal,
            double percentualDeImpostos
    ) {
        return faturamentoMensal
                * percentualDeImpostos
                / 100.0;
    }
}
