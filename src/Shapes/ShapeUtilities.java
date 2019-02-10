package Shapes;

public class ShapeUtilities {

    /**
     * @param shapes the array of shape objects
     * @param dynamicType the type for which you want to get the sum of paremeters
     * @return sum of paremeters for that dynamic type from the array
     */
    public static double sumParemeter(Shape [] shapes, String dynamicType)
    {
        double sumParemeter = 0.0;
        for (Shape currentShape:
                shapes) {
            if (currentShape == null) continue;
            if (currentShape.getClass().getSimpleName().equals(dynamicType))
            {
                sumParemeter += currentShape.getPerimeter();
            }
        }
        return sumParemeter;
    }

    /**
     * function that searches for the maximum parameter of a specific shape
     * @param shapeArray the array to be searched
     * @param dynamicType the dynamic type for which you want to find maximum parameter
     * @return maximum parameter
     */
    public static double findMaxParameter(Shape [] shapeArray, String dynamicType)
    {
        double maxParameter = 0.0;
        for(int i = 0; i < shapeArray.length; i++)
        {
            if (shapeArray[i] == null) continue;
            if (shapeArray[i].getClass().getSimpleName().equals(dynamicType) && shapeArray[i].getPerimeter() > maxParameter)
            {
                maxParameter = shapeArray[i].getPerimeter();
            }
        }
        return maxParameter;
    }

    /**
     * function that searches for the minimum parameter of a specific shape
     * @param shapeArray the array to be searched
     * @param dynamicType the dynamic type for which you want to find maximum parameter
     * @return minimum parameter
     */
    public static double findMinParameter(Shape [] shapeArray, String dynamicType)
    {

        double minParameter = 0.0;
        //setting to arbitrary min parameter
        for (Shape currentShape:
                shapeArray) {
            if(currentShape == null) continue;
            if(currentShape.getClass().getSimpleName().equals(dynamicType))
            {
                minParameter = currentShape.getPerimeter();
                break;
            }
        }

        for(int i = 0; i < shapeArray.length; i++)
        {
            if (shapeArray[i] == null) continue;
            if (shapeArray[i].getClass().getSimpleName().equals(dynamicType) && shapeArray[i].getPerimeter() < minParameter)
            {
                minParameter = shapeArray[i].getPerimeter();
            }
        }
        return minParameter;
    }

    /**
     * Displays the current shape array with checking
     * @param shapeArray
     */
    public static void displayShapeArray(Shape[] shapeArray)
    {
        int counter =0;
        for (Shape current :
                shapeArray) {
            if(current != null)
            {
                System.out.println(current);
                counter++;
            }
        }
        System.out.println(counter + " Shapes present in the array");
    }

    /**
     * removes the dynamic shapes with the matching parameters
     * @param shapeArray the array
     * @param dynamicType dynamic type for which the parameter is searched against
     * @param parameter the parameter to
     */
    public static void removeShapeByParameter(Shape[] shapeArray, String dynamicType, double parameter)
    {

        for(int i = 0; i < shapeArray.length; i++)
        {
            if (shapeArray[i] == null) continue;
            if(shapeArray[i].getClass().getSimpleName().equals(dynamicType) && shapeArray[i].getPerimeter() == parameter)
            {
//                System.out.println("REMOVED : " + shapeArray[i]);
                shapeArray[i] = null;
            }
        }
    }
}
