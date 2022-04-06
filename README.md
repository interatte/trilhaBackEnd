
<h1 align="center">
Desafio 02
</h1>

### Com suas palavras defina o que é programação orientada a objeto (POO), e cite seus pilares

	A programação orientate a objetos é um modelo de programação onde diversas classes possuem
	características que definem um objeto na vida real. Cada classe determina o comportamento do
	objeto definido por métodos e seus estados possíveis definidos por atributos. São exemplos de
	linguagens de programação orientadas a objetos: C++, Java, C#, Object Pascal, entre outras.
	Este modelo foi criado com o intuito de aproximar o mundo real do mundo virtual.
	Para dar suporte à definição de Objeto, foi criada uma estrutura chamada Classe,
	que reúne objetos com características em comum, descreve todos os serviços disponíveis por
	seus objetos e quais informações podem ser armazenadas.

	Os pilares da POO são:	
		1 - Abstração.
		2 - Encapsulamento.
		3 - Herança.
		4 - Polimorfismo.


### 1- Exemplifique e explique um cenario de Abstraçao
	Dentro da POO temos diversos conceitos de abtração, como por exemplo as interfaces
	e classes que escondam algo.
	Cenário:  No codigo abaixo mostramos que nao tem nenhuma abstraçao, ou seja
	se eu tiver esse codigo em varios lugares executando ao mesmo tempo, e fosse
	necessário alterar a propriedade Total para Amount, geraria um grande refatoramento.
	Porque cada usuário chama o CalculateTotal para reaslizar a tarefa.

			public class Order 
	{
	...
	public decimal Total { get; set; }
	public void CalculateTotal() {...}
	public void AddItem(Item item)
	{
	Items.Add(item);
	CalculateTotal();
	}
	...
	}
	
	Agora com o uso da abstração o usuario apenas cria o pedido permitindo que o
	codigo se gerencie sozinho, ou seja, o usuario faz o pedido e o codigochama o
	CalculateTotal, porque simplesmente alteramos a clase de publica para Privada,
	conforme exemplo abaixo
	
	public class Order
	{
	...
	public decimal Total { get; set; }
	private void CalculateTotal() {...}
	public void AddItem(Item item)
	{
	Items.Add(item);
	CalculateTotal();
	}
	...
	}



### 2- Exemplifique e explique um cenario de encapsulamento
	Encapsular os dados de uma aplicação significa evitar
	que estes sofram acessos indevidos. Para isso, é criada
	uma estrutura que contém métodos que podem ser utilizados
	por qualquer outra classe, sem causar inconsistências no
	desenvolvimento de um código
	
	Cenário: Suponha uma classe que representa uma conta bancária. Nela,
	a fins de simplificação, colocamos apenas os atributos nome e saldo.
	Também usaremos um método responsável por depositar um valor nessa conta bancária.
	
	O cálculo será feito da seguinte forma: o novo saldo será o somatório
	entre o valor atual mais o depósito acrescido de 10%, ou um fator de 0,10.
	
	Se os atributos puderem ser acessados diretamente em qualquer trecho do código,
	haverá o risco de o saldo ser alterado sem passar pelo método de depositar.
	Para evitar isso, podemos usar os métodos get e set para evitar o acesso direto.
	
	Logo, para proteger as variáveis nome e, principalmente o saldo, utilizamos
	os métodos get saldo e set saldo. Antes disso, no entanto, é preciso alterar
	o nível de acesso das variáveis de pública para privada.


### 3- Exemplifique e explique um cenario de herança
	O reuso de código é uma das grandes vantagens da programação orientada a objetos. 
	Muito disso se dá por uma questão que é conhecida como herança.
	Essa característica otimiza a produção da aplicação em tempo e linhas de código.
	
	Cenário:
	Para entendermos essa característica, vamos imaginar uma família: a criança,
	por exemplo, está herdando características de seus pais. Os pais, por sua vez,
	herdam algo dos avós, o que faz com que a criança também o faça, e assim sucessivamente.
	Na orientação a objetos, a questão é exatamente assim, como mostra exemplo  Abaixp
	O objeto abaixo na hierarquia irá herdar características de todos os objetos acima dele,
	seus “ancestrais”. A herança a partir das características do objeto mais acima é c
	onsiderada herança direta, enquanto as demais são consideradas heranças indiretas.
	Por exemplo, na família, a criança herda diretamente do pai e indiretamente do avô e do
	bisavô.
	O Objeto N herda do objeto 02 que herda do objeto 01

### 4- Exemplifique e explique um cenario de polimorfismo
	Outro ponto essencial na programação orientada a objetos é o chamado polimorfismo.
	Na natureza, vemos animais que são capazes de alterar sua forma conforme a
	necessidade, e é dessa ideia que vem o polimorfismo na orientação a objetos.
	Como sabemos, os objetos filhos herdam as características e ações de seus
	“ancestrais”. Entretanto, em alguns casos, é necessário que as ações para um mesmo
	método seja diferente. Em outras palavras, o polimorfismo consiste na alteração do
	funcionamento interno de um método herdado de um objeto pai.
	
	Cenário:
	Como um exemplo, temos um objeto genérico “Eletrodoméstico”. Esse objeto possui um método,
	ou ação, “Ligar()”. Temos dois objetos, “Televisão” e “Geladeira”, que não irão ser
	ligados da mesma forma. Assim, precisamos, para cada uma das classes filhas, reescrever
	o método “Ligar()”.
	Ou Seja, Televisãoào e Geladeira pertencem a mesma classe "Eletrodomestico"
	

### 5- Cite 5 vantagens de POO
	1- A codificação fica mais próxima do cenário real do problema a ser resolvido.
	2- A manutenção futura fica mais simples e rápida.
	3- Maior reutilização de código.
	4- Padronização do sistema.
	5 - Herança de código.
		

