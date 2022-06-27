Desafio 03 – 

A)	Com sua palavras defina: (máx 5 linhas)

1-) O que é protocolo de comunicação HTTP e como Funciona;
	R: O HTTP é um protocolo de comunicação, ou seja, uma convenção de regras e padrões que controla e possibilita uma conexão e troca de dados entre dois sistemas computacionais.
É baseado no modelo de cliente-servidor, ou seja, de um lado, um navegador requisita um determinado dado, e do outro, um computador (ou servidor) retorna a informação desejada (ou não, caso não ela seja encontrada, ocorra um erro ou não exista).
Criado na década de 1990, o HTTP surgiu da necessidade de se padronizar a troca de informações pela internet, de uma maneira que fosse leve, rápida e compreendida por todos os computadores conectados à rede.


2-) O que é Rest, e qual a sua relação com o protocolo HTTP;
REST(Representational State Transfer, que significa Transferência Representacional de Estado) é um modelo de arquitetura e não uma linguagem ou tecnologia de programação, que fornece diretrizes para que os sistemas distribuídos se comuniquem diretamente usando os princípios e protocolos existentes da Web sem a necessidade de SOAP ou outro protocolo sofisticado.
A origem do termo REST
Os conceitos do REST foram submetidos à tese de doutorado de Roy Fielding nos anos 2000, onde o princípio fundamental é usar o protocolo HTTP para comunicação de dados.
A arquitetura REST é simples e fornece acesso aos recursos para que o cliente REST acesse e renderize os recursos no lado do cliente. No estilo REST, URI ou IDs globais ajudam a identificar cada recurso.
Esta arquitetura usa várias representações de recursos para representar seu tipo, como XML, JSON, Texto, Imagens e assim por diante.
Vale ressaltar que o REST não se limita a solicitações e respostas de registros. Também é possível inserir um novo registro ou deletar um já existente.
•	A relação se dá pelo fato do REST utilizar os métodos do HTTP, tais como:
O método GET é o método mais comum, geralmente é usado para solicitar que um servidor envie um recurso;
•	O método POST foi projetado para enviar dados de entrada para o servidor. Na prática, é frequentemente usado para suportar formulários HTML;
•	O método PUT edita e atualiza documentos em um servidor;
•	O método DELETE que como o próprio nome já diz, deleta certo dado ou coleção do servidor.


3-) O que é Web API, e qual a sua relação com REST;
Uma Web API é uma interface de programação de aplicações tanto para um servidor quanto um navegador. É utilizada para se conseguir recuperar somente o valor necessitado num banco de dados de um site



B)	Liste todos os métodos de solicitação HTTP utilizados pelo Rest e suas respectivas finalidades;
GET
Essa é a requisição mais comum de todas. Através dessa requisição nós pedimos a representação de um recurso: que pode ser um arquivo html, xml, json, etc.
Um exemlo de requisição GET seria:
GET /entendendo-o-net-core-parte-3-o-coreclr/ HTTP/1.1  
User-Agent: Mozilla/4.0 (compatible; MSIE5.01; Windows NT)  
Host: http://gabsferreira.com  
Connection: Keep-Alive  
POST
O método POST é utilizado quando queremos criar um recurso. Quando usamos POST, os dados vão no corpo da requisição e não na URI.
PUT
Requisita que um recurso seja "guardado" na URI fornecida. Se o recurso já existir, ele deve ser atualizado. Se não existir, pode ser criado.
DELETE
Exclui o recurso especificado.
TRACE
Devolve a mesma requisição que for enviada veja se houve mudança e/ou adições feitas por servidores intermediários.
OPTIONS
Retorna os métodos HTTP suportados pelo servidor para a URL especificada.
PATCH
Serve para atualizar partes de um recurso, e não o recurso todo.
CONNECT
Converte a requisição de conexão para um túnel TCP/IP transparente, geralmente para facilitar a comunicação criptografada com SSL (HTTPS) através de um proxy HTTP não criptografado.

O que é Swagger?
Trata-se de uma aplicação open source que auxilia desenvolvedores nos processos de definir, criar, documentar e consumir APIs REST.  Em suma, o Swagger visa padronizar este tipo de integração, descrevendo os recursos que uma API deve possuir, como endpoints, dados recebidos, dados retornados, códigos HTTP e métodos de autenticação, entre outros.

