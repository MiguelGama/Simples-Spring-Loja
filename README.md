# Simples projeto
Projeto spring boot simples com teste unitário JUnit


## End Point
Projeto pode ser importado para a IDE própria Spring Tool Suite. 

**Listar Todos Clientes**
> GET /client/ HTTP/1.1
Host: localhost:8081

**Buscar Cliente por ID**
> GET /client/1 HTTP/1.1
Host: localhost:8081/

**Salvar Cliente**
> POST /client/ HTTP/1.1
Host: localhost:8081
Content-Type: application/json
{"name":"meu nome", "email": "aureliomiguelgama@gmail.com", "phone":"11 987878787"}

**Atualizar Cliente**
> PUT /client/ HTTP/1.1
Host: localhost:8081
Content-Type: application/json
{
    "id": 1,
    "name": "Nome Atualizado",
    "email": "novoemail@gmail.com",
    "phone": "11 332232323"
}


**Deletar Cliente**
> DELETE /client/1 HTTP/1.1
Host: localhost:8081

