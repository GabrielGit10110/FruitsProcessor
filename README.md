# 🍎 Processador de Dados de Frutas - Java

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://java.com)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

Aplicação Java para leitura e processamento de dados de frutas a partir de arquivos CSV, com filtragem e exibição tabular formatada.

## 📋 Descrição

Sistema que lê arquivos CSV contendo dados de alimentos, filtra especificamente frutas e exibe as informações em formato tabular organizado no console.

## 🏗️ Arquitetura do Projeto

```
📦 Fruit Data Processor
├── 🎨 View (FrutasMain)
├── ⚙️ Controller
│   ├── FruitsCtrl (Implementação)
│   └── IFilesController (Interface)
└── 📁 Estrutura de Dados
```

## 📁 Estrutura do Projeto

```
├── bin/
│   ├── controller/
│   │   ├── FilesController.class
│   │   ├── FruitsCtrl.class
│   │   └── IFilesController.class
│   └── view/
│       └── FrutasMain.class
└── src/
    ├── controller/
    │   ├── FilesController.java
    │   ├── FruitsCtrl.java
    │   └── IFilesController.java
    └── view/
        └── FrutasMain.java
```

## 🎯 Funcionalidades

### ✅ **Leitura e Validação de Arquivos**
- Verifica existência do diretório e arquivo
- Valida estrutura do arquivo CSV
- Tratamento de exceções robusto

### ✅ **Filtragem Inteligente**
- Filtra apenas alimentos do grupo "Fruits"
- Processamento linha por linha
- Identificação precisa por categoria

### ✅ **Saída Tabular Formatada**
- Formatação alinhada com `printf`
- Cabeçalho descritivo
- Separadores visuais para melhor legibilidade

## 🔧 Implementação

### **Interface IFilesController**
```java
public interface IFilesController {
    void readDir(String path) throws IOException;
    void createFile(String path, String name, String extension) throws IOException;
    void readFile(String path, String name, String extension) throws IOException;
    void openFile(String path, String name, String extension) throws IOException;
}
```

### **Classe FruitsCtrl**
```java
// Processamento principal com filtro de frutas
public class FruitsCtrl implements IFilesController {
    @Override
    public void readFile(String path, String name, String extension) throws IOException {
        // Implementação com:
        // - Leitura bufferizada eficiente
        // - Filtro por grupo "Fruit"
        // - Formatação tabular com printf
        // - Gerenciamento adequado de recursos
    }
}
```

## 🚀 Como Executar

### **Pré-requisitos**
- Arquivo `generic_food.csv` em `/tmp/CSVs/fruits/`
- Java 8 ou superior

### **Compilação**
```bash
javac -d bin src/controller/*.java src/view/*.java
```

### **Execução**
```bash
java -cp bin view.FrutasMain
```

## 📊 Exemplo de Saída

```
=============================================================================================
NOME                              NOME_CIENTIFICO                     SUBGRUPO
=============================================================================================
Kiwi                              Actinidia chinensis                 Tropical fruits
Pineapple                         Ananas comosus                      Tropical fruits
Apple                             Malus domestica                     Pome fruits
Banana                            Musa spp.                           Tropical fruits
...
```

## ⚙️ Características Técnicas

- **📖 Leitura Eficiente**: Bufferização para melhor performance
- **🛡️ Tratamento de Erros**: Validação de arquivos e diretórios
- **🎯 Filtro Preciso**: Seleção específica por grupo de alimentos
- **📐 Formatação Profissional**: Saída tabular alinhada
- **🔧 Interface Extensível**: Design que permite futuras expansões

## 💡 Casos de Uso

- **Análise de Dados Nutricionais**
- **Processamento de Datasets Alimentares**
- **Filtragem e Categorização de Alimentos**
- **Geração de Relatórios Formatados**

## 🎯 Tecnologias Utilizadas

- **Java SE**
- **Manipulação de Arquivos CSV**
- **Streams e Bufferização**
- **Formatação de Saída com printf**

## 👨‍💻 Autor

**Gabriel** - [GabrielGit10110](https://github.com/GabrielGit10110)

## 📝 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

<div align="center">

**Processando dados alimentares com precisão e elegância!** 🍎📊

</div>
