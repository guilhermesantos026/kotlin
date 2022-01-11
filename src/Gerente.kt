class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun getBonificacao(): Double = salario * 0.20
    // Modo mais enxuto

/*  Properties
    override val bonificacao: Double
       get() {
          return salario * 0.2
    }
*/

/*  Função
    override fun bonificacao(): Double {
        return salario * 0.2
    }
 */
}