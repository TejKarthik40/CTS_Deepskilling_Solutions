package org.pvp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        
        ExternalApi mockApi = mock(ExternalApi.class);

        
        when(mockApi.getData()).thenReturn("Mock Data");

        
        MyService service = new MyService(mockApi);

        
        String result = service.fetchData();

        
        assertEquals("Mock Data", result);
    }
    @Test
    public void testAnotherMockValue() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("CTS Deep Skilling");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("CTS Deep Skilling", result);
    }
    @Test
    public void testVerifyInteraction() {

        
        ExternalApi mockApi = mock(ExternalApi.class);

        
        MyService service = new MyService(mockApi);

        
        service.fetchData();

        
        verify(mockApi).getData();
    }
    @Test
    public void testVerifyCalledOnce() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi, times(1)).getData();
    }
}
