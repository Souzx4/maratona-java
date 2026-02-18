package maratonajava;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarioUtil extends JFrame {

    public CalendarioUtil() {

        setTitle("Calendário");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        criarCalendario();

        setVisible(true);
    }

    private void criarCalendario() {

        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int diaAtual = hoje.getDayOfMonth();

        YearMonth yearMonth = YearMonth.of(ano, mes);
        int totalDias = yearMonth.lengthOfMonth();
        int diaSemanaInicio = yearMonth.atDay(1).getDayOfWeek().getValue();

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel(
                hoje.getMonth() + " / " + ano,
                SwingConstants.CENTER
        );
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        JPanel painelDias = new JPanel();
        painelDias.setLayout(new GridLayout(0, 7));

        String[] diasSemana = {"Seg", "Ter", "Qua", "Qui", "Sex", "Sáb", "Dom"};

        for (String dia : diasSemana) {
            JLabel label = new JLabel(dia, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            painelDias.add(label);
        }

        // Espaços antes do primeiro dia
        for (int i = 1; i < diaSemanaInicio; i++) {
            painelDias.add(new JLabel(""));
        }

        // Dias do mês
        for (int dia = 1; dia <= totalDias; dia++) {
            JButton botaoDia = new JButton(String.valueOf(dia));

            if (dia == diaAtual) {
                botaoDia.setBackground(Color.GREEN);
                botaoDia.setForeground(Color.WHITE);
            }

            painelDias.add(botaoDia);
        }

        add(painelDias, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalendarioUtil::new);
    }
}


