
# Desafio do BootCamp "Heineken - Inteligência Artificial Aplicada a Dados com Copilot" da DIO

**Narrativa:**

- Sistema de controle e gerenciamento de execução de ordens de serviço em uma oficina mecânica.

- Clientes levam veículos à oficina mecânica para serem consertados ou para passarem por revisões  periódicas

- Cada veículo é designado a uma equipe de mecânicos que identifica os serviços a serem executados e preenche uma OS com data de entrega.

- A partir da OS, calcula-se o valor de cada serviço, consultando-se uma tabela de referência de mão-de-obra.

- O valor de cada peça também irá compor a OS.

- O cliente autoriza a execução dos serviços.

- A mesma equipe avalia e executa os serviços.

- Os mecânicos possuem código, nome, endereço e especialidade.

- Cada OS possui: n°, data de emissão, um valor, status e uma data para conclusão dos trabalhos.

-  Sistema de controle e gerenciamento de execução de ordens de serviço em uma oficina mecânica.

# Resumo

**Cliente 1:N Veículo** → Um cliente pode possuir vários veículos, mas cada veículo pertence a um único cliente.

**Veículo 1:N OS (Ordem de Serviço)** → Um veículo pode ter várias ordens de serviço ao longo do tempo, mas cada OS está associada a um único veículo.

**Equipe 1:N Mecânicos** → Uma equipe pode ter vários mecânicos, mas cada mecânico pertence a uma única equipe.

**Equipe 1:N OS** → Uma equipe pode estar responsável por várias ordens de serviço, mas cada OS é atribuída a apenas uma equipe.

**Serviço 1:1 Mão de Obra** → Cada serviço realizado está vinculado a uma única mão de obra, e vice-versa.

**OS N:M Serviço** → Uma ordem de serviço pode incluir vários serviços diferentes, e um mesmo serviço pode estar presente em várias OSs.

**OS N:M Peças** → Uma ordem de serviço pode exigir várias peças, e uma peça pode ser usada em diferentes OSs.
