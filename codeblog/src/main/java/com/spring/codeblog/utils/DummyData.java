package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    // @PostConstruct
    /* Comentado para evitar que fique recriando 2 posts sempre q rodar o codigo. */
    public void savePosts() {

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Ana Paula Sena");
        post1.setData(LocalDate.now());
        post1.setTitulo("AWS");
        post1.setTexto("A certificação AWS Certified Cloud Practitioner (CLF-C02) abrange uma ampla gama de tópicos relacionados à AWS e à computação em nuvem. A seguir estão listados os tópicos principais e os subtemas que são cobertos por essa certificação:\n" +
                "\n" +
                "1. Conceitos de Nuvem\n" +
                "Definição de Computação em Nuvem\n" +
                "Modelos de Implantação em Nuvem\n" +
                "Nuvem Pública\n" +
                "Nuvem Privada\n" +
                "Nuvem Híbrida\n" +
                "Modelos de Serviço em Nuvem\n" +
                "Infrastructure as a Service (IaaS)\n" +
                "Platform as a Service (PaaS)\n" +
                "Software as a Service (SaaS)\n" +
                "Benefícios da Computação em Nuvem\n" +
                "Princípios da Arquitetura da Nuvem\n" +
                "2. Segurança e Conformidade na Nuvem\n" +
                "Modelo de Responsabilidade Compartilhada\n" +
                "Práticas de Segurança na AWS\n" +
                "AWS Identity and Access Management (IAM)\n" +
                "Segurança de Rede\n" +
                "Segurança de Dados\n" +
                "Compliance na AWS\n" +
                "Padrões de Conformidade\n" +
                "Programas de Conformidade\n" +
                "Ferramentas de Segurança da AWS\n" +
                "AWS Shield\n" +
                "AWS WAF (Web Application Firewall)\n" +
                "AWS Key Management Service (KMS)\n" +
                "3. Tecnologia da Nuvem\n" +
                "Fundamentos de Rede\n" +
                "VPC (Virtual Private Cloud)\n" +
                "Subnetting\n" +
                "Gateway da Internet\n" +
                "NACLs (Network Access Control Lists)\n" +
                "Fundamentos de Computação\n" +
                "Amazon EC2 (Elastic Compute Cloud)\n" +
                "Auto Scaling\n" +
                "Elastic Load Balancing\n" +
                "Fundamentos de Armazenamento\n" +
                "Amazon S3 (Simple Storage Service)\n" +
                "Amazon EBS (Elastic Block Store)\n" +
                "Amazon EFS (Elastic File System)\n" +
                "Fundamentos de Banco de Dados\n" +
                "Amazon RDS (Relational Database Service)\n" +
                "Amazon DynamoDB\n" +
                "Amazon Redshift\n" +
                "Fundamentos de Gerenciamento de Identidade\n" +
                "AWS IAM (Identity and Access Management)\n" +
                "AWS Organizations\n" +
                "4. Faturamento e Preços\n" +
                "Princípios de Preço da AWS\n" +
                "Pay-as-you-go\n" +
                "Benefícios de Reservar Instâncias\n" +
                "Modelos de Pagamento\n" +
                "Ferramentas de Gerenciamento de Custos\n" +
                "AWS Cost Explorer\n" +
                "AWS Budgets\n" +
                "AWS Cost and Usage Report\n" +
                "Práticas de Otimização de Custos\n" +
                "Rightsizing\n" +
                "Reserva de Instâncias\n" +
                "Uso de Savings Plans\n" +
                "5. Suporte e Documentação da AWS\n" +
                "Níveis de Suporte da AWS\n" +
                "Básico\n" +
                "Developer\n" +
                "Business\n" +
                "Enterprise\n" +
                "Recursos de Suporte\n" +
                "AWS Support Center\n" +
                "AWS Trusted Advisor\n" +
                "AWS Personal Health Dashboard\n" +
                "Ferramentas de Documentação e Treinamento\n" +
                "AWS Whitepapers\n" +
                "AWS Documentation\n" +
                "AWS Training and Certification\n" +
                "AWS Well-Architected Framework\n" +
                "6. Introdução aos Serviços Principais da AWS\n" +
                "Computação\n" +
                "Amazon EC2\n" +
                "AWS Lambda\n" +
                "AWS Elastic Beanstalk\n" +
                "Armazenamento\n" +
                "Amazon S3\n" +
                "Amazon Glacier\n" +
                "Bancos de Dados\n" +
                "Amazon RDS\n" +
                "Amazon DynamoDB\n" +
                "Amazon Aurora\n" +
                "Redes e Entrega de Conteúdo\n" +
                "Amazon VPC\n" +
                "Amazon CloudFront\n" +
                "AWS Direct Connect\n" +
                "Ferramentas de Gerenciamento\n" +
                "AWS CloudFormation\n" +
                "AWS CloudTrail\n" +
                "AWS Config\n" +
                "Segurança, Identidade e Conformidade\n" +
                "AWS IAM\n" +
                "AWS KMS\n" +
                "AWS Shield e AWS WAF\n" +
                "Desenvolvimento e Ferramentas de Desenvolvimento\n" +
                "AWS CodeCommit\n" +
                "AWS CodeBuild\n" +
                "AWS CodeDeploy\n" +
                "AWS CodePipeline\n" +
                "7. Arquitetura de Alto Nível\n" +
                "Arquitetura Escalável\n" +
                "Arquitetura Resiliente\n" +
                "Desempenho e Eficiência de Custo\n" +
                "Princípios de Design da AWS Well-Architected Framework\n" +
                "Excelência Operacional\n" +
                "Segurança\n" +
                "Confiabilidade\n" +
                "Eficiência de Desempenho\n" +
                "Otimização de Custos\n" +
                "8. Casos de Uso e Soluções na AWS\n" +
                "Casos de Uso Comuns\n" +
                "Backup e Recuperação de Desastres\n" +
                "Armazenamento e Recuperação de Dados\n" +
                "Hospedagem de Aplicativos Web e Mobile\n" +
                "Computação Científica e Análise de Dados\n" +
                "Soluções de Referência\n" +
                "Arquiteturas de Big Data\n" +
                "Arquiteturas de IoT\n" +
                "Arquiteturas de Aplicativos Móveis\n" +
                "Arquiteturas de Microsserviços\n" +
                "9. Ferramentas de Monitoramento e Gerenciamento\n" +
                "AWS CloudWatch\n" +
                "AWS CloudTrail\n" +
                "AWS Trusted Advisor\n" +
                "AWS Config\n" +
                "10. Migração e Transferência de Dados\n" +
                "AWS Migration Hub\n" +
                "AWS Database Migration Service\n" +
                "AWS Snowball\n" +
                "AWS DataSync\n" +
                "11. Introdução ao Machine Learning e AI na AWS\n" +
                "Amazon SageMaker\n" +
                "AWS Deep Learning AMIs\n" +
                "Amazon Comprehend\n" +
                "Amazon Rekognition\n" +
                "Amazon Lex\n" +
                "12. Práticas de Melhores Práticas e Operações na Nuvem\n" +
                "Monitoramento e Logging\n" +
                "Operações Automáticas\n" +
                "Backup e Recuperação de Dados\n" +
                "Planejamento de Capacidade e Escalabilidade\n" +
                "13. Introdução à IoT na AWS\n" +
                "AWS IoT Core\n" +
                "AWS Greengrass\n" +
                "AWS IoT Analytics\n" +
                "14. Contêineres e Kubernetes na AWS\n" +
                "Amazon ECS (Elastic Container Service)\n" +
                "Amazon EKS (Elastic Kubernetes Service)\n" +
                "AWS Fargate\n" +
                "15. Desenvolvimento de Aplicativos na AWS\n" +
                "Práticas de DevOps\n" +
                "AWS CodePipeline\n" +
                "AWS CodeBuild\n" +
                "AWS CodeDeploy\n" +
                "AWS Cloud9\n" +
                "A certificação AWS Certified Cloud Practitioner (CLF-C02) abrange um total de 15 tópicos principais. Cada tópico principal pode incluir diversos subtemas específicos para proporcionar uma visão abrangente dos serviços, ferramentas, melhores práticas e conceitos fundamentais da AWS."
        );

        Post post2 = new Post();
        post2.setAutor("Ana Paula Sena");
        post2.setData(LocalDate.now());
        post2.setTitulo("AWS - Há custos no Deploy com Elastic Beanstalk");
        post2.setTexto(" Sim, existem custos associados ao uso do AWS Elastic Beanstalk, mas o próprio serviço Elastic Beanstalk não possui cobrança adicional. Os custos que você incorrerá são baseados nos recursos subjacentes da AWS que seu aplicativo utiliza. Aqui estão alguns dos principais componentes que podem gerar custos ao usar o Elastic Beanstalk:\n" +
                "\n" +
                "Componentes de Custos no AWS Elastic Beanstalk\n" +
                "Instâncias EC2 (Elastic Compute Cloud):\n" +
                "\n" +
                "Descrição: Elastic Beanstalk geralmente usa instâncias EC2 para hospedar sua aplicação. O custo depende do tipo e número de instâncias que você usa.\n" +
                "Exemplo de Custo: Se você usar uma instância t2.micro (elegível para a camada gratuita) e permanecer dentro dos limites da camada gratuita, você não incorrerá em custos adicionais. Caso contrário, será cobrado pelo uso da instância.\n" +
                "Elastic Load Balancer (ELB):\n" +
                "\n" +
                "Descrição: Se sua aplicação for configurada para escalabilidade, um load balancer pode ser usado para distribuir o tráfego entre múltiplas instâncias EC2.\n" +
                "Exemplo de Custo: Você será cobrado pelo número de horas que o load balancer estiver em uso e pelo volume de dados transferidos através dele.\n" +
                "Armazenamento (Amazon EBS - Elastic Block Store):\n" +
                "\n" +
                "Descrição: As instâncias EC2 usam volumes EBS para armazenamento de dados persistentes.\n" +
                "Exemplo de Custo: Você será cobrado pelo tamanho e tipo do volume EBS e pela quantidade de dados transferidos para e do volume.\n" +
                "Bancos de Dados (Amazon RDS, DynamoDB):\n" +
                "\n" +
                "Descrição: Se sua aplicação usar um banco de dados gerenciado, como o Amazon RDS ou DynamoDB, haverá custos associados a esses serviços.\n" +
                "Exemplo de Custo: Você será cobrado com base no tipo de instância de banco de dados, armazenamento provisionado, e uso de I/O.\n" +
                "Armazenamento de Objetos (Amazon S3):\n" +
                "\n" +
                "Descrição: Elastic Beanstalk pode usar S3 para armazenar versões de aplicações, logs e outros dados.\n" +
                "Exemplo de Custo: Você será cobrado pelo armazenamento utilizado e pelo volume de dados transferidos.\n" +
                "Outros Serviços AWS:\n" +
                "\n" +
                "Descrição: Serviços adicionais como Amazon CloudWatch (para monitoramento), AWS Lambda (para funções sem servidor), e outros, podem ser usados pela sua aplicação.\n" +
                "Exemplo de Custo: Cobranças variam dependendo do serviço e da quantidade de uso.\n" +
                "Gerenciando e Estimando Custos\n" +
                "Para gerenciar e estimar os custos associados ao uso do Elastic Beanstalk, você pode:\n" +
                "\n" +
                "AWS Pricing Calculator:\n" +
                "\n" +
                "Descrição: Ferramenta oficial da AWS para estimar os custos dos serviços baseados nas suas necessidades específicas.\n" +
                "Link: AWS Pricing Calculator\n" +
                "AWS Free Tier:\n" +
                "\n" +
                "Descrição: Aproveitar a camada gratuita da AWS para experimentar Elastic Beanstalk sem custos iniciais. Certifique-se de que os recursos utilizados (como tipos de instância EC2) estão dentro dos limites da camada gratuita.\n" +
                "Link: AWS Free Tier\n" +
                "Monitoramento de Custos:\n" +
                "\n" +
                "Descrição: Usar AWS Cost Explorer e AWS Budgets para monitorar e definir alertas para seus gastos.\n" +
                "Link: AWS Cost Explorer e AWS Budgets\n" +
                "Exemplos de Uso do Elastic Beanstalk\n" +
                "Para ilustrar, aqui estão três exemplos de projetos usando Elastic Beanstalk, cada um com uma linguagem de programação e um banco de dados específico:\n" +
                "\n" +
                "Exemplo 1: Aplicação Web Python com PostgreSQL\n" +
                "Linguagem: Python\n" +
                "Framework: Flask\n" +
                "Banco de Dados: PostgreSQL (Amazon RDS)\n" +
                "Componentes Usados:\n" +
                "EC2: Instâncias t2.micro\n" +
                "RDS: PostgreSQL db.t2.micro\n" +
                "S3: Para armazenar logs e backups\n" +
                "CloudWatch: Para monitoramento de métricas\n" +
                "Exemplo 2: Aplicação Node.js com MongoDB\n" +
                "Linguagem: JavaScript (Node.js)\n" +
                "Framework: Express\n" +
                "Banco de Dados: MongoDB (usando MongoDB Atlas ou Amazon DocumentDB)\n" +
                "Componentes Usados:\n" +
                "EC2: Instâncias t2.micro\n" +
                "DocumentDB: MongoDB db.r5.large\n" +
                "S3: Para armazenar logs e backups\n" +
                "CloudWatch: Para monitoramento de métricas\n" +
                "Exemplo 3: Aplicação Java com MySQL\n" +
                "Linguagem: Java\n" +
                "Framework: Spring Boot\n" +
                "Banco de Dados: MySQL (Amazon RDS)\n" +
                "Componentes Usados:\n" +
                "EC2: Instâncias t2.micro\n" +
                "RDS: MySQL db.t2.micro\n" +
                "S3: Para armazenar logs e backups\n" +
                "CloudWatch: Para monitoramento de métricas\n" +
                "Considerações Finais\n" +
                "Elastic Beanstalk facilita o gerenciamento de infraestrutura para aplicações web, mas é importante monitorar o uso dos recursos subjacentes para evitar custos inesperados. Utilize as ferramentas de monitoramento e estimativa de custos da AWS para manter o controle sobre suas despesas.");
        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = codeBlogRepository.save(post);
            System.out.println(postSaved.getId());

        }
    }
}