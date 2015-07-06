package scalatutorial.patternmatching

object Evaluator {
  type Env = String => Int

  def main(args: Array[String]) {
    val env: Env = { case "x" => 5 case "y" => 7}
    val exp: Tree = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    println("Expression: " + exp)
    println("Evaluation with x=5, y=7: " + eval(exp, env))
  }

  def eval(t: Tree, env: Env): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(v) => v
  }

}
