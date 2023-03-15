/* Nama : Athiya Puteri Hidayat
   NIM : 24060121140128
   Deskripsi : post test
*/


class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
	TimSepakbola liverpool = new TimSepakbola("Liverpool");
    
    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
	TimSepakbola manchesterUnited = new TimSepakbola("Manchester United");

    // TODO: call startTandingBola()
	liverpool.startTandingBola(manchesterUnited);
		

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.getSkor() + " - " + manchesterUnited.getSkor() + " " + manchesterUnited.nama);
    }

		// TODO: call endTandingBola()
	manchesterUnited.endTandingBola(liverpool);
		
  }
}