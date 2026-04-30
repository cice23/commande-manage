$root = "C:\Users\hp\spring-boot-edge-microservices"

$services = @(
    @{ name="eureka-server"; path="$root\eureka-server" },
    @{ name="config-server"; path="$root\config-server" },
    @{ name="gateway-server"; path="$root\gateway-server" },
    @{ name="microservice-produits"; path="$root\microservice-produits" },
    @{ name="microservice-commandes"; path="$root\microservice-commandes" },
    @{ name="microservice-paiement"; path="$root\microservice-paiement" },
    @{ name="microservice-clientui"; path="$root\microservice-clientui" }
)

foreach ($svc in $services) {
    Start-Process powershell -ArgumentList "-NoExit", "-Command", "Set-Location '$($svc.path)'; .\mvnw.cmd spring-boot:run" -WindowStyle Normal
}