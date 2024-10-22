FROM fluent/fluentd:v1.16-1

# Trocar para o usuário root para instalar gems
USER root

# Instalar activesupport na versão correta # Uma versão que funciona com Ruby 2.7
RUN gem install activesupport -v 6.1.4.4 

# Instalar o plugin splunk-hec
RUN gem install fluent-plugin-splunk-hec

# Voltar para o usuário padrão
USER fluent