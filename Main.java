import java.io.*;

public class Main {

    static BufferedReader input =
            new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
            );

    public static void main(
            String[] args)
            throws Exception {

        SearchEngine engine =
                new SearchEngine();

        while (true) {

            System.out.println();
            System.out.println(
                    "=========================================="
            );

            System.out.println(
                    "       RESEARCH PAPER SEARCH ENGINE"
            );

            System.out.println(
                    "=========================================="
            );

            System.out.println(
                    "1. Search Research Domain"
            );

            System.out.println(
                    "2. View Paper Details"
            );

            System.out.println(
                    "3. KMP Title Search"
            );

            System.out.println(
                    "4. Rabin-Karp Search"
            );

            System.out.println(
                    "5. Z Algorithm Search"
            );

            System.out.println(
                    "6. Fuzzy Search"
            );

            System.out.println(
                    "7. Save Paper"
            );

            System.out.println(
                    "8. View Saved Papers"
            );

            System.out.println(
                    "9. View Search History"
            );

            System.out.println(
                    "10. Clear Search History"
            );

            System.out.println(
                    "11. Exit"
            );

            System.out.print(
                    "\nEnter your choice: "
            );

            int choice;

            try {

                choice =
                        Integer.parseInt(
                                input.readLine()
                        );

            } catch (Exception e) {

                System.out.println(
                        "Enter a valid number."
                );

                continue;
            }


            // ----------------------------------
            // DOMAIN SEARCH
            // ----------------------------------

            if (choice == 1) {

                System.out.print(
                        "\nEnter research domain: "
                );

                String domain =
                        input.readLine();

                engine.searchDomain(
                        domain
                );
            }


            // ----------------------------------
            // VIEW PAPER
            // ----------------------------------

            else if (choice == 2) {

                System.out.print(
                        "\nEnter paper number: "
                );

                int number =
                        Integer.parseInt(
                                input.readLine()
                        );

                engine.viewPaper(
                        number
                );
            }


            // ----------------------------------
            // KMP
            // ----------------------------------

            else if (choice == 3) {

                System.out.print(
                        "\nEnter title keyword: "
                );

                String keyword =
                        input.readLine();

                System.out.println(
                        "\nRunning KMP..."
                );

                engine.kmpSearch(
                        keyword
                );
            }


            // ----------------------------------
            // RABIN-KARP
            // ----------------------------------

            else if (choice == 4) {

                System.out.print(
                        "\nEnter title keyword: "
                );

                String keyword =
                        input.readLine();

                System.out.println(
                        "\nRunning Rabin-Karp..."
                );

                engine.rabinKarpSearch(
                        keyword
                );
            }


            // ----------------------------------
            // Z ALGORITHM
            // ----------------------------------

            else if (choice == 5) {

                System.out.print(
                        "\nEnter title keyword: "
                );

                String keyword =
                        input.readLine();

                System.out.println(
                        "\nRunning Z Algorithm..."
                );

                engine.zSearch(
                        keyword
                );
            }


            // ----------------------------------
            // FUZZY SEARCH
            // ----------------------------------

            else if (choice == 6) {

                System.out.print(
                        "\nEnter approximate title: "
                );

                String query =
                        input.readLine();

                System.out.println(
                        "\nRunning Edit Distance..."
                );

                engine.fuzzySearch(
                        query
                );
            }


            // ----------------------------------
            // SAVE PAPER
            // ----------------------------------

            else if (choice == 7) {

                System.out.print(
                        "\nEnter paper number to save: "
                );

                int number =
                        Integer.parseInt(
                                input.readLine()
                        );

                engine.savePaper(
                        number
                );
            }


            // ----------------------------------
            // SAVED PAPERS
            // ----------------------------------

            else if (choice == 8) {

                FileManager.showSavedPapers();
            }


            // ----------------------------------
            // HISTORY
            // ----------------------------------

            else if (choice == 9) {

                FileManager.showHistory();
            }


            // ----------------------------------
            // CLEAR HISTORY
            // ----------------------------------

            else if (choice == 10) {

                FileManager.clearHistory();
            }


            // ----------------------------------
            // EXIT
            // ----------------------------------

            else if (choice == 11) {

                System.out.println(
                        "\nThank you!"
                );

                break;
            }


            else {

                System.out.println(
                        "Invalid choice."
                );
            }
        }
    }
}
