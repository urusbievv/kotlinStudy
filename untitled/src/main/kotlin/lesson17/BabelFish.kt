package lesson17

class BabelFish(
    private val coefficient: Int?
) {

    var isTranslated = false

    var nerveSignal = 200
        get() = if (coefficient != null) field * coefficient else field
        set(value: Int) {
            if (value > 300) {
                isTranslated = true
                println("added value = $value")
            }
        }

    // ���� ������ field ������������ ����� ���������� ������,
    // ��������� ����������� ����� ��� ����������

}