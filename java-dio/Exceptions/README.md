# Tratamento de erros -  Exceptions 

- Exceção é um evento que interrompe o fluxo normal do processamento de uma classe
- O uso corre de exceções torna o programa mais robusto e confiável.
- Um programa pode continuar executando depois de lidar com o problema.
- Incorpore sua estratégia de tratamento de exceções no sistema desde o princípio.
- Pode ser difícil implementar o tratamento de exceções depois do sistema implementado.

#### Error 
* Usado pela JVM .
* Serve para indicar se existe algum problema de recurso do programa.
* Execução do programa não continua.

#### Unchecked (Runtime) 
* Exceptions que podem ser evitados se forem tratados e analisados.

#### Checked Exception
* Exceptions que DEVEM ser evitados e tratados pelo dev para o programa funcionar.

#### Runtime Exception
* Exceções não checadas pelo compilador (Erros de lógica).

#### Exception 
* Condições excepcionais checadas pelo compilador ( eventos recuperáveis ).

#### More errors 
* Erros não checados pelo compilador ( eventos irrecuperáveis ).

#### try, catch, finally
* Cada uma dessas palavras, juntas, definem bloco para o tratamento de exceções

#### throws
* Declara que um método pode lançar uma ou várias exceções.