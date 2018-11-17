package SDA_Algorytmy.pl.dopierala.lesson13.Tree.BinaryTree;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static java.lang.Math.max;

public class BinaryTreeElement {
    private Integer data;
    private BinaryTreeElement leftElement;
    private BinaryTreeElement rightElement;

    public BinaryTreeElement(Integer data) {
        this.data = data;
    }

    public BinaryTreeElement(BinaryTreeElement leftElement, Integer data, BinaryTreeElement rightElement) {
        this.data = data;
        this.leftElement = leftElement;
        this.rightElement = rightElement;
    }

    public static BinaryTreeElement exampleTree() {
        return new BinaryTreeElement(
                new BinaryTreeElement(
                        new BinaryTreeElement(0),
                        3,
                        null
                ),
                5,
                new BinaryTreeElement(6)
        );

    }

    @Override
    public String toString() {
        StringBuilder sbld = new StringBuilder();
        sbld.append("{data=" + data);
        if (leftElement != null)
            sbld.append(", leftE=" + leftElement.data);
        if (rightElement != null)
            sbld.append(", rightE=" + rightElement.data);
        sbld.append("}");
        return sbld.toString();
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BinaryTreeElement getLeftElement() {
        return leftElement;
    }

    public void setLeftElement(BinaryTreeElement leftElement) {
        this.leftElement = leftElement;
    }

    public BinaryTreeElement getRightElement() {
        return rightElement;
    }

    public void setRightElement(BinaryTreeElement rightElement) {
        this.rightElement = rightElement;
    }

    public String toSimpleJSON() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ \"data\": ").append(data);
        if (leftElement != null) stringBuilder.append(", \"left\": ").append(leftElement.toSimpleJSON());
        if (rightElement != null) stringBuilder.append(", \"right\": ").append(rightElement.toSimpleJSON());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toFormattedJSON() {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            engine.eval("function toJSON(obj){ return JSON.stringify(JSON.parse(obj),null,4) };");
            Invocable scriptFunction = (Invocable) engine;
            String formattedJSON = scriptFunction.invokeFunction("toJSON", toSimpleJSON()).toString();
            return formattedJSON.replaceAll("\"", "");
        } catch (ScriptException | NoSuchMethodException e) {
            return "";
        }

    }


    public int heightOfTree(){
//        int leftHeight=0;
//        int rightHeight=0;
//
//        if (leftElement != null)
//            leftHeight=leftElement.heightOfTree();
//        if (rightElement != null)
//            rightHeight=rightElement.heightOfTree();

        int leftHeight  = (leftElement ==null) ? 0: leftElement.heightOfTree();
        int rightHeight = (rightElement==null) ? 0: rightElement.heightOfTree();

        return Integer.max(leftHeight,rightHeight)+1;
    }



}
