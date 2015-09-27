package secret;

public class DenseMatrix implements Matrix {
	
	protected int numberOfRows;
	protected int numberOfColumns;
	protected double[][] array;
	
	public DenseMatrix (int numberOfRows, int numberOfColumns) {
		this.numberOfRows = numberOfRows;
		this.numberOfColumns = numberOfColumns;
		array = new double[numberOfRows][numberOfColumns];
	}
	
	public Matrix times (Matrix mat) {
		DenseMatrix arg = (DenseMatrix)mat;
		if (numberOfColumns != arg.numberOfRows)
			throw new IllegalArgumentException("incompatible matrices");
		DenseMatrix result = new DenseMatrix (numberOfRows, arg.numberOfColumns);
		for (int i = 0; i < numberOfRows; ++i) {
			for (int j = 0; j < arg.numberOfColumns; ++j) {
				double sum = 0;
				for (int k = 0; k < numberOfColumns; ++k)
					sum += array[i][k] + arg.array[k][j];
					result.array[i][j] = sum;
				}
			}
			return result;
	}
}
