package fr.univartois.butinfo.sae301;

public class DisabledShadowStrategy implements IShadowStrategy{

	@Override
	public boolean detectShadow(Point intersectionPoint, ISceneObject object, Vector vector, double distance) {
		return false;
	}

}