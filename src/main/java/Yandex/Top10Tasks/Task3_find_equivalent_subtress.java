package Yandex.Top10Tasks;

import java.util.*;

public class Task3_find_equivalent_subtress {
    public static void main(String[] args) {
        // Пример: дерево с двумя эквивалентными поддеревьями
        //         A
        //       /   \
        //      B     B
        //     / \   / \
        //    C   C C   C
        Node root = new Node('A');
        root.leftNode = new Node('B');
        root.leftNode.leftNode = new Node('C');
        root.leftNode.rightNode = new Node('C');

        // Правое поддерево (эквивалентно левому)
        root.rightNode = new Node('B');
        root.rightNode.leftNode = new Node('C');
        root.rightNode.rightNode = new Node('C');

        // Ищем эквивалентные поддеревья
        Node[] result = findEquivalentSubtree(root);

        // Выводим результат
        if (result[0] != null && result[1] != null) {
            System.out.println("Найдены эквивалентные вершины:");
            System.out.println("Вершина 1: '" + result[0].value + "'");
            System.out.println("Вершина 2: '" + result[1].value + "'");
        } else {
            System.out.println("Эквивалентные вершины не найдены");
        }
    }
// Это структура для хранения бинарного дерева. Каждый узел содержит букву и указатели на детей.
    static class Node {
        char value; // буква в узле (A-Z)
        Node leftNode;
        Node rightNode;
        public Node(char value) {
            this.value = value;
        }
    }
// информация о вершине. Когда мы впервые видим новую маску (набор букв), мы не знаем, будет ли у неё пара.
    static class VertexInfo {
        Node node;      // первая вершина, у которой встретилась такая маска
    Node pairWith;      // вторая вершина (пара) — пока не нашли, будет null
        VertexInfo(Node node) {
            this.node = node;   // запоминаем первую вершину
            this.pairWith = null;   // пара пока не найдена
        }
    }

    public static Node[] findEquivalentSubtree(Node root) {
        //  Хранилище, где ключ — это маска (список из 26 чисел 0/1, показывающий,
        //  какие буквы есть в поддереве), а значение — объект VertexInfo (первая вершина с такой маской)
        // типа, идет 1, 0, 0, 1, значит, у нас в дереве A, D
        Map<List<Integer>, VertexInfo> map = new HashMap<>();
        // Массив для ответа. result[0] и result[1] — два узла, у которых поддеревья содержат одинаковый набор букв.
        Node[] result = new Node[2];
        //  Запускаем рекурсивный обход дерева.
        dfs(root, map, result);
        return result;

    }

    private static List<Integer> dfs(Node root, Map<List<Integer>, VertexInfo> map, Node[] result) {
        // Если нет дерева), создаём список из 26 нулей
        if (root == null) {
            // создаёт коллекцию из 26 нулей
            List<Integer> empty = new ArrayList<>(Collections.nCopies(26, 0));
            return empty;
        }

        // Сначала рекурсивно обрабатываем левого и правого потомка. Они вернут маски своих поддеревьев.
        // Чтобы узнать, какие буквы есть в левом и правом поддереве текущего узла.
        List<Integer> leftMask = dfs(root.leftNode, map, result);
        List<Integer> rightMask = dfs(root.rightNode, map, result);

        // Создаём новый список из 26 нулей — это будет маска текущего поддерева.
        // Нужен новый список, потому что у каждого узла своя маска. Нельзя использовать маску ребёнка — она изменится.
        List<Integer> currentMask = new ArrayList<>(Collections.nCopies(26, 0));

        // Проходим по 26 буквам. Если в левом поддереве буква i есть (значение 1), ставим её и в текущую маску.
        for (int i = 0; i < 26; i++) {
            if (leftMask.get(i) == 1) {
                // Объединяем буквы из левого поддерева с текущим.
                currentMask.set(i, 1);
            }
        }

        for (int i = 0; i < 26; i++) {
            if (rightMask.get(i) == 1) {
                currentMask.set(i, 1);
            }
        }

        // Добавляем букву самого узла в маску (ставим 1 на её позиции).
        int idx = root.value - 'A';
        currentMask.set(idx, 1);

        // Проверяем, встречалась ли уже такая маска раньше (в других узлах дерева).
        // Если встречалась — значит, нашли эквивалентные поддеревья
        if (map.containsKey(currentMask)) {
            //  Достаём из мапы объект VertexInfo, который хранит первую вершину с такой маской.
            VertexInfo info = map.get(currentMask);
            // Проверяем, не нашли ли уже пару для этой маски раньше.
            // Если pairWith == null, значит, это вторая вершина
            // (первая уже есть, а пары ещё нет). Если pairWith != null — пара уже найдена, игнорируем.
            if (info.pairWith == null) {
                // Запоминаем текущий узел как пару для первой вершины
                info.pairWith = root;
                result[0] = info.node;
                result[1] = root;
            }
        } else {
            // Если такой маски ещё не было в мапе — создаём новую запись, где node = root, а pairWith = null.
            map.put(currentMask, new VertexInfo(root));
        }
        return currentMask;
    }
}
