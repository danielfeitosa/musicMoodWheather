# musicMoodWheather

### Manual de instalação

 - Pré-requisitos : Docker e docker-compose
 
 #### Variáveis de ambiente - Antes de executar o docker-compose 

- Edite o deploy.sh (que está na raiz do projeto)com os Ids de cliente do Spotify e a chave da API OpenWeatherMaps:

 - CLIENT_SPOTIFY_ID
 - SECRET_SPOTIFY_ID
 - OPEN_WHEATHER_KEY

- Depois execute do script deploy.sh
- Quando finalizar de subir as instâncias do docker-compose digite no browser htto://localhost:1200

