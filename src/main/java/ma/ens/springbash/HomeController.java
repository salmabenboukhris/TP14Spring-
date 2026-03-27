package ma.ens.springbash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
                <!DOCTYPE html>
                <html lang="fr">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Spring Boot TP</title>
                    <style>
                        body {
                            margin: 0;
                            font-family: Arial, sans-serif;
                            background: linear-gradient(135deg, #e3f2fd, #ffffff);
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                        }
                        .card {
                            background: white;
                            padding: 40px;
                            border-radius: 15px;
                            box-shadow: 0 4px 20px rgba(0,0,0,0.15);
                            text-align: center;
                            width: 500px;
                        }
                        h1 {
                            color: #1976d2;
                            margin-bottom: 15px;
                        }
                        p {
                            color: #444;
                            font-size: 18px;
                            margin: 8px 0;
                        }
                        .status {
                            margin-top: 20px;
                            display: inline-block;
                            padding: 10px 18px;
                            background: #4caf50;
                            color: white;
                            border-radius: 20px;
                            font-weight: bold;
                        }
                    </style>
                </head>
                <body>
                    <div class="card">
                        <h1>TP Spring Boot + Bash</h1>
                        <p>Application démarrée avec succès</p>
                        <p>Port utilisé : 8085</p>
                        <p>Projet réalisé avec Spring Boot</p>
                        <div class="status">Serveur actif</div>
                    </div>
                </body>
                </html>
                """;
    }
}