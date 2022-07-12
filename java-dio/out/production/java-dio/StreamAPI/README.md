# Stream APIS

----
### Classe Anônima 
*  Classe anônima em Java é uma classe que não recebeu nome e é declarada e instanciada em uma única instrução

### Functional Interface 

* Qualquer inteface com um SAM(Single Abstract Method) é uma interface funcional e sua implementação
* pode ser tratada como expressão lambda

### Lambda 
*  É uma função sem declaração, não é necessário colocar um nome, um tipo de retorno e modificador de acesso.
*  O método seja declarado no mesmo lugar em que será usado.
*  (argumento) -> (corpo)

### Reference Method 
*  Novo recurso Java 8
*  Permite fazer referencia a um método ou construtor de uma classe( de forma funcional )
*  Para utilizá-lo, basta informa uma classe ou referência seguida do símbolo '::' e o nome do método sem parênteses

* Ex -> meusGatos.sort(Comparator.comparing(Gato::getNome));

### Streams API 
*  Nova opção para a manipulação de coleções em Java seguindo programação funcional
*  Combinada com expressões lambda, proporcionando uma forma diferente de ligar com Collections
* SOURCE --> PIPELINE --> TERMINAL