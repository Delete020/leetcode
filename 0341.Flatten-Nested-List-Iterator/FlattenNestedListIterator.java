/**
 * @author Delete020
 * @since 07/29/22 23:57 PM
 */
public class FlattenNestedListIterator {
    public class NestedIterator implements Iterator<Integer> {

        Stack<NestedInteger> stack;

        public NestedIterator(List<NestedInteger> nestedList) {
            stack = new Stack<>();
            for (int i = nestedList.size() - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
        }

        @Override
        public Integer next() {
            return stack.pop().getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!stack.isEmpty()) {
                if (stack.peek().isInteger()) return true;
                List<NestedInteger> top = stack.pop().getList();
                for (int i = top.size() - 1; i >= 0; i--) {
                    stack.push(top.get(i));
                }
            }
            return false;
        }
    }