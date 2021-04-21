import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String apiUrl = "https://corona.lmao.ninja/v2/countries/france?yesterday=true";

        // Création du client HTTP
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        // Création de la requête GET sur l'url apiUrl avec un header custom
        Request request = new Request.Builder()
                .url(apiUrl)
                .get()
                .addHeader("Cookie", "__cfduid=d48ffdf28008c5b6f259bcc6e417dbf421616949583")
                .build();

        try {
            // ObjectMapper jackson pour le traitement du retour de la requête
            ObjectMapper objectMapper = new ObjectMapper();

            // Appel de l'API sur apiUrl
            ResponseBody responseBody = client.newCall(request).execute().body();

            // Récupération des données de l'API dans l'object CovidEntity
            CovidEntity entity = objectMapper.readValue(responseBody.string(), CovidEntity.class);

            System.out.println(entity.toString());

            // Exemple de désérialisation
            String deserializedEntity = objectMapper.writeValueAsString(entity);

            System.out.println(deserializedEntity);

            // Création d'une copie profonde de entity
            CovidEntity mySecondEntity = objectMapper.readValue(deserializedEntity, CovidEntity.class);

            // utilisation de la méthode de deep clone pour créer une autre copie profonde
            CovidEntity myThirdEntity = mySecondEntity.deepClone();

            System.out.println(myThirdEntity.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
